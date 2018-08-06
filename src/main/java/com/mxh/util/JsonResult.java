package com.mxh.util;

/**
 * ��װ ���ظ�ǰ�˵Ľ��
 * 
 * @author mxh
 * @version ����ʱ�䣺2018��8��7������12:22:01 ��˵��
 */
public class JsonResult<T> {
	//�Ƿ�ɹ�
	private boolean success;
	//�ɹ�ʱ���ص�����
	private T data;
	//������Ϣ
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
