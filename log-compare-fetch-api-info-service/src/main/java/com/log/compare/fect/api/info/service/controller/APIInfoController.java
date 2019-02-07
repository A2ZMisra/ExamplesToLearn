package com.log.compare.fect.api.info.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.log.compare.fect.api.info.service.client.APIClient;
import com.log.compare.fect.api.info.service.model.APIDetails;
import com.log.compare.fect.api.info.service.repository.APIInfoRepository;

@RestController
public class APIInfoController {
	
	@Autowired
	APIInfoRepository apiInfoRepository;
	
	@Autowired
	APIClient apiClient;
	
	@GetMapping("/getapidesc/{apiName}")
	public String getAPIInfoDescription(@PathVariable(name="apiName") String apiName) {
		APIDetails apiDetails = apiClient.getApiByName(apiName);
		if(apiDetails != null)
			return apiInfoRepository.findApiInfo(apiDetails.getApiName());
		return null;
	}

}
