package com.cts.brownfield.pss.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.brownfield.pss.entity.Flight;

@FeignClient(name="search-service") // http://localhost:search-service/api/pss
public interface SearchServiceProxy {
	@GetMapping("/api/pss/findFlight/{id}")
	Flight findFlight(@PathVariable("id") long id);
}
