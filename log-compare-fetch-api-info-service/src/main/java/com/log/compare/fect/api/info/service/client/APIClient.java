package com.log.compare.fect.api.info.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.log.compare.fect.api.info.service.model.APIDetails;

@FeignClient(name="log-compare-api-service")
public interface APIClient {

	@GetMapping("/getapibyname/{apiName}")
	APIDetails getApiByName(@PathVariable("apiName") String apiName);
}
