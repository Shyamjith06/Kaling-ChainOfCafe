package com.mindtree.kalingachainofcafe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.kalingachainofcafe.entity.Cafe;
import com.mindtree.kalingachainofcafe.repository.CafeManagerRepository;

public interface CafeManagerService {

	public List<Cafe> getCafe(int managerId);
}
