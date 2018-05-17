package com.andy.cmn.base;

import java.util.Date;


/**
 * 基础实体类
 * <P>com.andy.cmn.base.BaseEntity</P>
 * <P>Date: 2017年7月8日 下午9:04:23</P>
 * @author andy
 * @version 1.0
 */
public abstract class BaseEntity extends BaseObj {
	private static final long serialVersionUID = -2077106029477648403L;

	/** 创建时间 <br/> add by andy wang */
	private Date ctime;
	
	/** 修改时间 <br/> add by andy wang */
	private Date mtime;
	

	/* getset ********************************************/
	

	/**
	 * 属性 ctime getter方法
	 * @return 属性ctime
	 * @author andy wang<br/>
	 */
	public Date getCtime() {
		return ctime;
	}

	/**
	 * 属性 ctime setter方法
	 * @param ctime 设置属性ctime的值
	 * @author andy wang<br/>
	 */
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	/**
	 * 属性 mtime getter方法
	 * @return 属性mtime
	 * @author andy wang<br/>
	 */
	public Date getMtime() {
		return mtime;
	}

	/**
	 * 属性 mtime setter方法
	 * @param mtime 设置属性mtime的值
	 * @author andy wang<br/>
	 */
	public void setMtime(Date mtime) {
		this.mtime = mtime;
	}


}