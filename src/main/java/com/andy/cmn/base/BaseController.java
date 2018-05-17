package com.andy.cmn.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import com.andy.cmn.entity.ResultModel;
import com.andy.cmn.exception.BizException;


/**
 * 基础控制类
 * <P>BaseController.java</P>
 * <P>Description: </P>
 * <P>Copyright: Copyright(c) 2017</P>
 * <P>Date: 2017年7月8日 下午9:07:30</P>
 * @author andy
 * @version 1.0
 */
public abstract class BaseController {

	/**项目页面前缀访问路径*/
	@Value("${adminPath}")
	protected String adminPath;

	/**项目页面前缀访问路径*/
	@Value("${web.view.prefix}")
	protected String prefix;


	/**项目页面前缀访问路径*/
	@Value("${web.view.suffix}")
	protected String suffix;
	
	protected String getUrl ( String url ) throws Exception {
		return this.prefix + url + this.suffix;
	}
	
	/**
	 * 处理校验
	 * @param br
	 * @throws BizException
	 * <P>@author andy</P>
	 * <P>Date 2017年1月13日 下午2:42:20</P>
	 */
	public ResultModel handleValid( BindingResult br ) throws BizException {
		ResultModel rm = new ResultModel();
		rm.setStatus(0);
		if ( br.hasErrors() ) {
			List<ObjectError> allErrors = br.getAllErrors();
			for (int i = 0; i < allErrors.size(); i++) {
				ObjectError objectError = allErrors.get(i);
				if ( !rm.contains(objectError.getDefaultMessage()) ) {
					rm.addMessage(objectError.getDefaultMessage()+"<br/><br/>");
				}
			}
		}
		return rm;
	}
}