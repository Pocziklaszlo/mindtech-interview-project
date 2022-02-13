package com.mindtech.mindtech.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.mindtech.mindtech.model.Covid;

@Repository
public interface CovidRepository extends CrudRepository<Covid,Long> {
	
	List<Covid> findAll();
}
