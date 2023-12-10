package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CitizenPlan;
import com.example.demo.search.SearchRequest;

public interface ReportService {

	public List<String> getplaneName();
	
	public List<String> getPlaneStatuses();
	
	public List<CitizenPlan> search(SearchRequest searchRquest);
	
	public boolean exportExcel();
	public boolean exportPDF();
	
}
