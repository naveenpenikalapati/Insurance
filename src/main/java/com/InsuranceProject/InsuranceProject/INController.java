package com.InsuranceProject.InsuranceProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class INController 
{
    @GetMapping
	public String addAgent()
	{
		return "added agent";
	}
	
}
