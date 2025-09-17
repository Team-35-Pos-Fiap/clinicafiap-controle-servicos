package br.com.clinicafiap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ClinicaFiapControleServicosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicaFiapControleServicosApplication.class, args);
	}
}