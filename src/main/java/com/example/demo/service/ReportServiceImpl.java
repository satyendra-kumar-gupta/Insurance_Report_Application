package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CitizenPlan;
import com.example.demo.repository.CitezenplanRepository;
import com.example.demo.search.SearchRequest;

@Service
public class ReportServiceImpl implements ReportService{
	
	@Autowired
	CitezenplanRepository citezenplanRepository;

	@Override
	public List<String> getplaneName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getPlaneStatuses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CitizenPlan> searchCitizenPlan(SearchRequest searchRquest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportPDF() {
		// TODO Auto-generated method stub
		return false;
	}

}
