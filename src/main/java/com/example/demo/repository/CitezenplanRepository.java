package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.CitizenPlan;

public interface CitezenplanRepository extends JpaRepository<CitizenPlan, Integer>  {

	
	    @Query("select distinct(plane_name) from citizen_plan_info")
		public List<String> getPlaneNames();
	    
	    @Query("select distinct(plane_status) from citizen_plan_info")
		public List<String> getPlaneStatus();
}
