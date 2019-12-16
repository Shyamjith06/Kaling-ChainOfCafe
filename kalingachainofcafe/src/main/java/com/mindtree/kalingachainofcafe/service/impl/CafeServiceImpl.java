package com.mindtree.kalingachainofcafe.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mindtree.kalingachainofcafe.entity.Cafe;
import com.mindtree.kalingachainofcafe.repository.CafeRepository;
import com.mindtree.kalingachainofcafe.service.CafeService;
@Service
public class CafeServiceImpl  implements CafeService{

	
	@Autowired
	CafeRepository cafeRepository;
	@Override
	public Cafe addCafe(Cafe cafe) {
		return cafeRepository.save(cafe);
		
	}
	@Override
	public List<Cafe> getCafeByRevenue(int revenue) {
		
		List<Cafe> cafe=new ArrayList<>();
		cafe=cafeRepository.findAll();
		List<Cafe> cafes=new ArrayList<>();
		for (Cafe cafe2 : cafe) 
		{
			if(cafe2.getCafeRevenue()>revenue)
			{
				cafes.add(cafe2);
			}
		}
		return cafes;
	}

}



