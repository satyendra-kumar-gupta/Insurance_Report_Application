package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CitizenPlan;


public interface CitezenplanRepository extends JpaRepository<CitizenPlan, Integer>  {

	    @Query( value ="select distinct(plane_name) from CITIZEN_PLAN_INFO " , nativeQuery = true)
		public List<String> getPlaneNames();
	    
	    @Query(value ="select distinct(plane_status) from CITIZEN_PLAN_INFO", nativeQuery = true)
		public List<String> getPlaneStatus();
	
	
}
