package com.mindtree.kalingachainofcafe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.kalingachainofcafe.entity.Cafe;
import com.mindtree.kalingachainofcafe.service.CafeManagerService;
import com.mindtree.kalingachainofcafe.service.CafeService;

@RestController
public class CafeController {
   @Autowired
   CafeService cafeService;
   
   @PostMapping("/addcafe")
	public Cafe addCampusMind(@RequestBody Cafe cafe)
	{
		return cafeService.addCafe(cafe);
	}
//   @GetMapping("/getbyrevenue")
//   public List<Cafe> getAllCafeByRevenue(@RequestParam int revenue)
//   {
//	   return cafeService.getCafeByRevenue(revenue);
//   }
	
}
