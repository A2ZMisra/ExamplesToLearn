package com.log.compare.api.service.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.log.compare.api.service.model.APIDetails;
import com.log.compare.api.service.repository.APIRepository;

@RestController
public class APIController {
	
	@Autowired
	APIRepository apiRepository;
	
	@PostMapping("/addapi")
	public void addApi(@RequestBody APIDetails apiDetails) {
		apiRepository.add(apiDetails);
	}
	
	@GetMapping("/getapis")
	public ArrayList<APIDetails> getApi() {
		return apiRepository.get();
	}

	@GetMapping("/getapibyname/{apiName}")
	public APIDetails getApiByName(@PathVariable("apiName") String apiName) {
		return apiRepository.find(apiName);
	}
}
