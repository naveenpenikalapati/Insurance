package com.InsuranceProject.InsuranceProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class INController 
{
    @GetMapping
	public String addAgent()
	{
		return "added agent";
	}
	
    @PostMapping
	public String addAgents()
	{
		return "added post agent";
	}
    
    @PostMapping
	public String addedUI()
	{
		return "added UI GRAPHICS";
	}
}
