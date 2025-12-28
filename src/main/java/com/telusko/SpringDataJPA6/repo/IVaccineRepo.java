package com.telusko.SpringDataJPA6.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.SpringDataJPA6.model.Vaccine;
import com.telusko.SpringDataJPA6.view.View;


public interface IVaccineRepo extends JpaRepository<Vaccine, Integer>{
	
	List<? extends View> findByCostGreaterThan(Double cost,Class<? extends View> cls);
	
}
