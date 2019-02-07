package com.log.compare.fect.api.info.service.repository;

import java.util.ArrayList;

import com.log.compare.fect.api.info.service.model.APIInfoDesc;

public class APIInfoRepository {

	ArrayList<APIInfoDesc> listOfApisWithDesc = new ArrayList<>();
	
	public APIInfoRepository() {
		APIInfoDesc apiInfoDesc = new APIInfoDesc();
		apiInfoDesc.setApiName("Add API");
		apiInfoDesc.setApiDesc("This is used to add apis to the catalog");
		listOfApisWithDesc.add(apiInfoDesc);
	}
	
	public String findApiInfo(String apiName) {
		for(APIInfoDesc apiInfo : listOfApisWithDesc) {
			if(apiInfo.getApiName().equals(apiName))
				return apiInfo.getApiDesc();
		}
		return null;
	}
}
