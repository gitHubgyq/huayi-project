package com.huayi.api.util;

import java.io.Serializable;

/**   
* @Title: ResultBean.java 
* @Package mob.interfaces.util 
* @Description:  返回的结果集
* @author 王鹏焱
* @date 2016年7月19日 
* @version V1.0   
*/
public class ResultBean implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String msg="";
	
	private Object data;

	private Integer code;


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * 为返回对象赋值
	 * @param code
	 * @param msg
	 * @param Data
	 * @param resultBean
	 * @return
	 */
	public ResultBean resultBeanSet(Integer code, String msg, Object data, ResultBean resultBean) {
		resultBean.setCode(code);
		resultBean.setMsg(msg);
		resultBean.setData(data);
		return resultBean;
	}
	
	
	public ResultBean() {
	}
	
	/**
	 * 无结果／错误信息返回
	 * 
	 * @param code
	 * @param msg
	 */
	public ResultBean(Integer code, String msg) {
		this.setCode(code);
		this.setMsg(msg);
	}

	
}
