package com.andy.cmn.base;

import com.github.pagehelper.Page;

/**
 * 基础VO
 * <br/>com.andy.cmn.base.BaseVO<br/>
 * @version 2017年8月18日 下午4:16:00<br/>
 * @author andy wang<br/>
 */
public abstract class BaseVO<T> extends BaseObj {
	
	private static final long serialVersionUID = 5830304202346548961L;
	
	/** 当前页面 */
	private Integer currentPage;
	
	/** 每页显示数量 */
	private Integer pageSize;
	
	/* 分页 end **************************/

	/** 对应实体类 */
	protected T entity;
	
	
	/* getset *************************************************/

	public Integer getCurrentPage() {
		if(currentPage == null) return 0;
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getPageSize() {
		if(pageSize == null) return 8;
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	/* method *************************************************/
	
	/**
	 * 复制page对象数量
	 * @param page
	 * <P>@author andy</P>
	 * <P>Date 2017年1月11日 下午8:22:13</P>
	 */
	public void setPage( Page page ) {
		if ( page == null ) {
			return ;
		}
		this.currentPage = page.getPageNum();
		this.pageSize = page.getPageSize();
	}
	
	/**
	 * 属性 entity getter方法
	 * @return 属性entity
	 * @author andy wang<br/>
	 */
	public T getEntity() {
		return entity;
	}
	/**
	 * 属性 entity setter方法
	 * @param entity 设置属性entity的值
	 * @author andy wang<br/>
	 */
	public void setEntity(T entity) {
		this.entity = entity;
	}
	
}
