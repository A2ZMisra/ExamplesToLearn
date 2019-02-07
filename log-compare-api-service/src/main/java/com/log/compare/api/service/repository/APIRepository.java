package com.log.compare.api.service.repository;

import java.util.ArrayList;

import com.log.compare.api.service.model.APIDetails;

public class APIRepository {

	private ArrayList<APIDetails> listOfApis = new ArrayList<>();
	
	public void add(APIDetails apiDetails) {
		listOfApis.add(apiDetails);
	}
	
	public ArrayList<APIDetails> get() {
		return listOfApis;
	}
	
	public APIDetails find(String apiName) {
		for(APIDetails api : listOfApis) {
			if(api.getApiName().equals(apiName))
				return api;
		}
		return null;
	}
}
