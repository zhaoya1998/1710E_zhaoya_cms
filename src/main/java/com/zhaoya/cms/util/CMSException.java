package com.zhaoya.cms.util;
/**
 * 
 * @ClassName: CMSException 
 * @Description:  CMS 鑷畾涔夊紓甯�
 * @author: charles
 * @date: 2020骞�1鏈�11鏃� 涓嬪崍3:01:52
 */
public class CMSException extends RuntimeException {
	
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private  String message;

	public CMSException() {

	}

	public CMSException(String message) {
		super(message);
		this.message =message;
	}
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
