package edu.uco.monitoria.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"edu.uco.monitoria"})
public class MonitoriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitoriaApplication.class, args);
		
		
	}

}
