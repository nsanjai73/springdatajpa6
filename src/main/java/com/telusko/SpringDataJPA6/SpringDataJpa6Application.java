package com.telusko.SpringDataJPA6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringDataJPA6.model.Vaccine;
import com.telusko.SpringDataJPA6.service.VaccineService;
import com.telusko.SpringDataJPA6.view.ResultView1;
import com.telusko.SpringDataJPA6.view.ResultView2;
import com.telusko.SpringDataJPA6.view.ResultView3;

@SpringBootApplication
public class SpringDataJpa6Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa6Application.class, args);
		
		VaccineService service = container.getBean(VaccineService.class);
		
		service.fetchByCostGreaterThan(500.5, ResultView1.class).forEach(v->System.out.println(v));
		System.out.println("********************************");
		service.fetchByCostGreaterThan(500.5, ResultView2.class).forEach(v->System.out.println(v));
		System.out.println("********************************");
		service.fetchByCostGreaterThan(500.5, ResultView3.class).forEach(v->System.out.println(v));

		
	}

}
