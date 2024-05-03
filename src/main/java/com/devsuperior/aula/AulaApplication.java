package com.devsuperior.aula;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class AulaApplication implements CommandLineRunner{

	@Autowired
	private OrderService orderService;


	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
//		Order order = new Order (1034, 150.00,20.0);
//		Order order = new Order (2282, 800.00,10.0);
		Order order = new Order (1309, 95.90 , 0.0);
		
		
		Double result = orderService.total(order);

		System.out.println("Pedido código "+ order.getCode());
		System.out.printf("Valor total: %.2f%n", result);
		
		
		
	}

}
