package com.log.compare.fect.api.info.service.model;

public class APIDetails {

	private String apiName;
	private String apiUri;
	
	public String getApiName() {
		return apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}
	public String getApiUri() {
		return apiUri;
	}
	public void setApiUri(String apiUri) {
		this.apiUri = apiUri;
	}
	
	@Override
	public String toString() {
		return "APIDetails [apiName=" + apiName + ", apiUri=" + apiUri + "]";
	}
}
