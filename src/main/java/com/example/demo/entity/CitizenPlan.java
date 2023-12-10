package com.example.demo.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name ="CITIZEN_PLAN_INFO")
public class CitizenPlan {
	
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer citizenId;
	
	private String citizenName;
	private String gender;
	private String planeName;
	private String planeStatus;
	private LocalDate planeStartDate;
	private LocalDate planeEnddate;
	private Double benefitAmount;
	private String denialReason;
	private LocalDate terminationDate;
	private String terminationRsn;
}
