package com.mindtech.mindtech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mindtech.mindtech.service.CovidApiService;
import com.mindtech.mindtech.service.CovidService;

@Controller
public class CovidController {

	private CovidService covidService;
	
	private CovidApiService covidApiService;

	@Autowired
	public void setCovidService(CovidService covidService) {
		this.covidService = covidService;
	}
	
	@Autowired
	public void setCovidApiService(CovidApiService covidApiService) {
		this.covidApiService = covidApiService;
	}

	@GetMapping("load")
	@ResponseBody
	public String loadCovidData() {
		
		this.covidApiService.gatherApiData();
		
		return "<H1>Hi</H1>";
	}
	
	
	
}
