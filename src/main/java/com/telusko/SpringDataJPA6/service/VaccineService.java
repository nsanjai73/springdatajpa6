package com.telusko.SpringDataJPA6.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.ScrollPosition.Direction;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.telusko.SpringDataJPA6.model.Vaccine;
import com.telusko.SpringDataJPA6.repo.IVaccineRepo;
import com.telusko.SpringDataJPA6.view.View;

import jakarta.transaction.Transactional;

@Service
public class VaccineService implements IVaccineService {
	
	@Autowired
	private IVaccineRepo repo;

	@Override
	public List<? extends View> fetchByCostGreaterThan(Double cost, Class<? extends View> cls) {
		return repo.findByCostGreaterThan(cost, cls);
	}

	
	
}
