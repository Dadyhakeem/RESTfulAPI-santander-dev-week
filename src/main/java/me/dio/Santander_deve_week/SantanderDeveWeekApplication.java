package me.dio.Santander_deve_week;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="me.dio.Santander_deve_week.controller"+" me.dio.Santander_deve_week.service.Imp"  )


public class SantanderDeveWeekApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderDeveWeekApplication.class, args);
	}

}
