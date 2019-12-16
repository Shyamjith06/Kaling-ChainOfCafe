package com.mindtree.kalingachainofcafe.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mindtree.kalingachainofcafe.entity.Cafe;
import com.mindtree.kalingachainofcafe.entity.CafeManager;
import com.mindtree.kalingachainofcafe.repository.CafeManagerRepository;
import com.mindtree.kalingachainofcafe.service.CafeManagerService;

@Service
public class CafeManagerServiceImpl implements CafeManagerService {

	
	@Autowired
	CafeManagerRepository cafeManagerRepository;
	@Override
	public List<Cafe> getCafe(int managerId) {
		
		List<Cafe> cafe=new ArrayList<>();
		CafeManager cafeManager=new CafeManager();
		cafeManager=cafeManagerRepository.findById(managerId).get();
		return cafe=cafeManager.getCafe();
	}

}
