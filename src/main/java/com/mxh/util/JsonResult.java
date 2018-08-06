package com.mxh.util;

/**
 * 封装 返回给前端的结果
 * 
 * @author mxh
 * @version 创建时间：2018年8月7日上午12:22:01 类说明
 */
public class JsonResult<T> {
	//是否成功
	private boolean success;
	//成功时返回的类型
	private T data;
	//错误信息
	private String error;

	public JsonResult(boolean success, T data) {
		super();
		this.success = success;
		this.data = data;
	}

	public JsonResult(boolean success, String error) {
		super();
		this.success = success;
		this.error = error;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
