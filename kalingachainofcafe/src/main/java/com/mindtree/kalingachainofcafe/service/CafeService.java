package com.mindtree.kalingachainofcafe.service;

import java.util.List;

import com.mindtree.kalingachainofcafe.entity.Cafe;

public interface CafeService {

	public Cafe addCafe(Cafe cafe);

	public List<Cafe> getCafeByRevenue(int revenue);
		
	

}
