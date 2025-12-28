package com.telusko.SpringDataJPA6.service;

import java.util.List;

import com.telusko.SpringDataJPA6.view.View;

public interface IVaccineService {
	
	List<? extends View> fetchByCostGreaterThan(Double cost,Class<? extends View> cls);

	
}
