package com.log.compare.fect.api.info.service.model;

public class APIInfoDesc {
	
	private String apiName;
	private String apiDesc;
	
	public String getApiName() {
		return apiName;
	}
	
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	
	public String getApiDesc() {
		return apiDesc;
	}
	
	public void setApiDesc(String apiDesc) {
		this.apiDesc = apiDesc;
	}
	
	@Override
	public String toString() {
		return "APIInfoDesc [apiName=" + apiName + ", apiDesc=" + apiDesc + "]";
	}
}
