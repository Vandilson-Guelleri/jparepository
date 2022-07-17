package com.devsuperior.jparepository.services;

import org.springframework.stereotype.Service;

@Service
public class DeliveryServices {

	public double fee(String state) {
		if("SP" .equalsIgnoreCase(state)) {
			return 10.0;
		}
		return 20.0;
	}
}
