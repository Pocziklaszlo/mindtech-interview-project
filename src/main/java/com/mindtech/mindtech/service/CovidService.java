package com.mindtech.mindtech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtech.mindtech.model.Covid;
import com.mindtech.mindtech.repository.CovidRepository;

@Service
public class CovidService {

	private CovidRepository repository;

	@Autowired
	public void setRepository(CovidRepository repository) {
		this.repository = repository;
	}
	
	public List<Covid> findAll(){
		return this.repository.findAll();
	}
	
	
	
}
