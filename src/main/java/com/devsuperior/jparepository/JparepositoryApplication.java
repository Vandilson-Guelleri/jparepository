package com.devsuperior.jparepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.jparepository.services.PayService;

@SpringBootApplication
public class JparepositoryApplication implements CommandLineRunner{

	@Autowired
	private PayService payService;
	
	public static void main(String[] args) {
		SpringApplication.run(JparepositoryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Resultado = " + payService.finalPrice(300.0, "SP"));
		
	}

	
}
