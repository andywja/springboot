package com.andy.cmn.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.pagehelper.Page;


/**
 * 返回结果对象
 * <P>ResultModel.java</P>
 * <P>Description: </P>
 * <P>Copyright: Copyright(c) 2017</P>
 * <P>Date: 2017年7月8日 下午10:55:16</P>
 * @author andy
 * @version 1.0
 */
public class ResultModel implements Serializable {

	private static final long serialVersionUID = 1L;

	/* 属性 *********************************************/
	/**
	 * 请求状态
	 * 1 - 正常访问
	 * -1 - 访问失败
	 * <b>创建日期</b>:<br/> 2017年2月9日 下午10:30:47<br/>
	 * @author andy wang<br/>
	 */
	private Integer status=1;
	
	/**
	 * 返回的信息
	 * <b>创建日期</b>:<br/> 2017年2月9日 下午10:30:47<br/>
	 * @author andy wang<br/>
	 */
	private List<String> msg;
	
	/**
	 * 返回数据
	 * <b>创建日期</b>:<br/> 2017年2月9日 下午10:30:47<br/>
	 * @author andy wang<br/>
	 */
	private Map<String,List> resultList = new HashMap<String, List>();
	private Map<String,Object> resultObj = new HashMap<String, Object>();
	private Map<String,Object> resultPage = new HashMap<String, Object>();

	/* 属性 *********************************************/
	public static final String RESULT_LIST = "list";
	public static final String RESULT_PAGE = "page";
	public static final String RESULT_OBJ = "obj";
	
	/**
	 * 设置错误
	 * 创建日期:<br/> 2017年2月9日 下午10:31:32<br/>
	 * @author andy wang<br/>
	 */
	public ResultModel setError() {
		this.status = 0;
		return this;
	}
	
	/**
	 * 设置返回对象集合
	 * @param list 列表
	 * 创建日期:<br/> 2017年2月9日 下午10:33:05<br/>
	 * @author andy wang<br/>
	 * @throws Exception 
	 */
	public ResultModel setPage( Page page ) throws Exception {
		if ( this.resultPage == null ) {
			this.resultPage = new HashMap<String, Object>();
		}
		this.resultPage.put(RESULT_PAGE, PageInfo.loadPage(page));
		return this;
	}
	
	/**
	 * 获取返回对象集合
	 * @return
	 * 创建日期:<br/> 2017年2月10日 下午2:25:19<br/>
	 * @author andy wang<br/>
	 */
	@JsonIgnore
	public PageInfo getPage() {
		if ( this.resultPage == null ) {
			return null;
		}
		return (PageInfo) this.resultPage.get(RESULT_PAGE);
	}
	
	/**
	 * 设置返回对象集合
	 * @param list 列表
	 * 创建日期:<br/> 2017年2月9日 下午10:33:05<br/>
	 * @author andy wang<br/>
	 */
	public ResultModel setList( List list ) {
		if ( this.resultList == null ) {
			this.resultList = new HashMap<String, List>();
		}
		this.resultList.put(RESULT_LIST, list);
		return this;
	}
	
	/**
	 * 获取返回对象集合
	 * @return
	 * 创建日期:<br/> 2017年2月10日 下午2:25:19<br/>
	 * @author andy wang<br/>
	 */
	@JsonIgnore
	public List getList() {
		if ( this.resultList == null ) {
			return null;
		}
		return (List) this.resultList.get(RESULT_LIST);
	}
	
	/**
	 * 设置返回对象
	 * @param obj
	 * 创建日期:<br/> 2017年2月10日 下午2:24:36<br/>
	 * @author andy wang<br/>
	 */
	public ResultModel setObj( Object obj ) {
		if ( this.resultObj == null ) {
			this.resultObj = new HashMap<String, Object>();
		}
		this.resultObj.put(RESULT_OBJ, obj);
		return this;
	}
	
	/**
	 * 获取返回对象
	 * @return
	 * 创建日期:<br/> 2017年2月10日 下午2:23:16<br/>
	 * @author andy wang<br/>
	 */
	@JsonIgnore
	public Object getObj() {
		if ( this.resultObj == null ) {
			return null;
		}
		return this.resultObj.get(RESULT_OBJ);
	}
	
	
	/**
	 * 获取状态
	 * @return
	 * 创建日期:<br/> 2017年2月10日 下午2:22:51<br/>
	 * @author andy wang<br/>
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 设置状态
	 * @param status 状态值
	 * 创建日期:<br/> 2017年2月10日 下午2:22:40<br/>
	 * @author andy wang<br/>
	 */
	public ResultModel setStatus(Integer status) {
		this.status = status;
		return this;
	}

	/**
	 * 获取所有返回结果
	 * @return
	 * 创建日期:<br/> 2017年2月10日 下午2:22:30<br/>
	 * @author andy wang<br/>
	 */
	public Map<String, List> getResultList() {
		return this.resultList;
	}
	

	/**
	 * 获取所有返回结果
	 * @return
	 * 创建日期:<br/> 2017年2月10日 下午2:22:30<br/>
	 * @author andy wang<br/>
	 */
	public Map<String, Object> getResultPage() {
		return this.resultPage;
	}
	
	/**
	 * 获取所有返回结果
	 * @return
	 * 创建日期:<br/> 2017年2月10日 下午2:22:30<br/>
	 * @author andy wang<br/>
	 */
	public Map<String, Object> getResultObj() {
		return this.resultObj;
	}
	
	/**
	 * 添加返回对象
	 * @param key 索引key
	 * @param list 设置集合
	 * @return
	 * 创建日期:<br/> 2017年2月10日 下午2:22:05<br/>
	 * @author andy wang<br/>
	 */
	public Map<String,List> putList( String key , List list ){
		this.resultList.put(key, list);
		return this.resultList;
	}
	
	/**
	 * 添加返回对象
	 * @param key 索引key
	 * @param page 设置分页对象
	 * @return
	 * 创建日期:<br/> 2017年2月10日 下午2:22:05<br/>
	 * @author andy wang<br/>
	 * @throws Exception 
	 */
	public Map<String,Object> putPage( String key , Page page ) throws Exception{
		this.resultPage.put(key, PageInfo.loadPage(page));
		return this.resultPage;
	}
	
	/**
	 * 添加返回对象
	 * @param key 索引key
	 * @param obj 返回对象
	 * @return
	 * 创建日期:<br/> 2017年2月10日 下午2:22:05<br/>
	 * @author andy wang<br/>
	 */
	public Map<String, Object> putObj( String key , Object obj ){
		this.resultObj.put(key, obj);
		return this.resultObj;
	}
	
	/**
	 * 添加信息
	 * @param message
	 * 创建日期:<br/> 2017年2月10日 下午2:21:59<br/>
	 * @author andy wang<br/>
	 */
	public ResultModel addMessage ( String message ) {
		if ( this.msg == null ) {
			this.msg = new ArrayList<String>();
		}
		this.msg.add(message);
		return this;
	}
	
	/**
	 * 判断提示信息是否已经存在
	 * @param message 提示信息
	 * @return 是否已经存在
	 * @version 2017年3月10日 上午9:29:32<br/>
	 * @author andy wang<br/>
	 */
	public Boolean contains ( String message ) {
		if ( this.msg == null ) {
			return false;
		}
		return this.msg.contains(message);
	}
	
	/**
	 * 获取信息
	 * @return
	 * 创建日期:<br/> 2017年2月10日 下午2:21:48<br/>
	 * @author andy wang<br/>
	 */
	public String getMessage(){
		StringBuffer sb = new StringBuffer();
		if ( this.msg == null || this.msg.isEmpty() ) {
			return "";
		}
		for (int i = 0; i < this.msg.size(); i++) {
			sb.append(this.msg.get(i)+"\r\n");
		}
		return sb.toString();
	}
	
	/**
	 * 判断是否访问错误
	 * @return true - 访问成功<br/>
	 * fale - 访问失败
	 * 创建日期:<br/> 2017年2月11日 下午8:47:00<br/>
	 * @author andy wang<br/>
	 */
	public Boolean isSuccess () {
		return 1 == this.getStatus();
	}
	
}
