package com.example.demo.search;

import java.time.LocalDate;

import lombok.Data;

@Data
public class SearchRequest {

	private String planNam;
	private String planStatuString;
	private String genderString;
	private LocalDate startDate;
	private LocalDate endDate;
}
