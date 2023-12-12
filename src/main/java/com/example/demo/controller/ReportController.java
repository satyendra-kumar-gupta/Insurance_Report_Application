package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.CitizenPlan;
import com.example.demo.search.SearchRequest;
import com.example.demo.service.ReportServiceImpl;

@Controller
public class ReportController {
	
	@Autowired
	private ReportServiceImpl reportServiceImpl;
	
	
	@PostMapping("/search")
	public String searchHandler(SearchRequest searchRequest,Model model) {
		
		List<CitizenPlan> citizenPlans = reportServiceImpl.search(searchRequest);
		
		model.addAttribute("citizenPlans",citizenPlans);
		model.addAttribute("search",searchRequest);
		
		init(model);
		return "index";
	}
	
	@GetMapping("/")
	public String indexPage(Model model) {
		
		//SearchRequest searchObjectc = new SearchRequest();
		
		init(model);
		
		return "index";
	}

	private void init(Model model) {
		model.addAttribute("command", new SearchRequest());
		model.addAttribute("names", reportServiceImpl.getplaneName());
		model.addAttribute("status", reportServiceImpl.getPlaneStatuses());
	}
}
