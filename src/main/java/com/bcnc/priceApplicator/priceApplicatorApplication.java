package com.bcnc.priceApplicator;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Price Applicator",
		version = "0.0.1",
		description = "Prueba Técnica"))
public class priceApplicatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(priceApplicatorApplication.class, args);
	}

}
