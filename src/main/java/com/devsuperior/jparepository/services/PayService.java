package com.devsuperior.jparepository.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PayService {

	@Autowired
	private TaxService taxService; 
	
	@Autowired
	private DeliveryServices deliverService;
	
	public double finalPrice(double cost, String state) {
		return cost + deliverService.fee(state) + taxService.tax(cost);
	}
}