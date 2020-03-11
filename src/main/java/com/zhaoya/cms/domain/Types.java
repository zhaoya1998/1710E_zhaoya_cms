package com.zhaoya.cms.domain;

public enum Types {

	HTML(0,"文本内容"),IMAGE(1,"图片内容");
	
	private Integer code;
	private String name;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private Types(Integer code, String name) {
		this.code = code;
		this.name = name;
	}
	
	
}
