/*
 * Created on 2017年8月22日
 * PageInfo.java V1.0
 */
package com.andy.cmn.entity;

import java.util.List;

import com.github.pagehelper.Page;

/**
 * <br/>com.andy.cmn.entity.PageInfo<br/>
 * @version 2017年8月22日 下午7:16:59<br/>
 * @author andy wang<br/>
 */
public class PageInfo {
	
	/** 当前页码 */
	private int pageIndex;
	
	/** 每页显示数据数量 */
	private int pageSize;

	/** 页码总数 */
	private int pageCount;

	/** 数据总数量 */
	private long count;

	/** 数据集合 */
	private List list;
	
	
	/**
	 * 读取分页对象
	 * @param page 分页对象
	 * @return 
	 * @throws Exception
	 * @version 2017年8月22日 下午7:23:41<br/>
	 * @author andy wang<br/>
	 */
	public static PageInfo loadPage ( Page page ) throws Exception {
		PageInfo info = new PageInfo();
		info.pageIndex = page.getPageNum();
		info.pageCount = page.getPages();
		info.count = page.getTotal();
		info.list = page.getResult();
		
		return info;
	}


	/**
	 * 属性 当前页码 getter方法
	 * @return 属性pageIndex
	 * @author andy wang<br/>
	 */
	public int getPageIndex() {
		return pageIndex;
	}
	


	/**
	 * 属性 当前页码 setter方法
	 * @param pageIndex 设置属性当前页码的值
	 * @author andy wang<br/>
	 */
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	


	/**
	 * 属性 每页显示数据数量 getter方法
	 * @return 属性pageSize
	 * @author andy wang<br/>
	 */
	public int getPageSize() {
		return pageSize;
	}
	


	/**
	 * 属性 每页显示数据数量 setter方法
	 * @param pageSize 设置属性每页显示数据数量的值
	 * @author andy wang<br/>
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	


	/**
	 * 属性 页码总数 getter方法
	 * @return 属性pageCount
	 * @author andy wang<br/>
	 */
	public int getPageCount() {
		return pageCount;
	}
	


	/**
	 * 属性 页码总数 setter方法
	 * @param pageCount 设置属性页码总数的值
	 * @author andy wang<br/>
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	


	/**
	 * 属性 数据总数量 getter方法
	 * @return 属性count
	 * @author andy wang<br/>
	 */
	public long getCount() {
		return count;
	}
	


	/**
	 * 属性 数据总数量 setter方法
	 * @param count 设置属性数据总数量的值
	 * @author andy wang<br/>
	 */
	public void setCount(long count) {
		this.count = count;
	}
	


	/**
	 * 属性 数据集合 getter方法
	 * @return 属性list
	 * @author andy wang<br/>
	 */
	public List getList() {
		return list;
	}
	


	/**
	 * 属性 数据集合 setter方法
	 * @param list 设置属性数据集合的值
	 * @author andy wang<br/>
	 */
	public void setList(List list) {
		this.list = list;
	}
	
	
}
