package com.mindtree.kalingachainofcafe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.kalingachainofcafe.entity.Cafe;
import com.mindtree.kalingachainofcafe.service.CafeManagerService;

@RestController
public class CafeManagerController {

	
	@Autowired
	CafeManagerService cafeManagerService;
	@GetMapping("/getcafe")
	public List<Cafe> getCafe(@RequestParam int managerId)
	{
		return cafeManagerService.getCafe(managerId);
	}
}
