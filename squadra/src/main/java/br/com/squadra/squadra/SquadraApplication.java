package br.com.squadra.squadra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.squadra.controller.SistemaController;

@EnableJpaRepositories("br.com.squadra.repository")
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackageClasses = SistemaController.class)
public class SquadraApplication {

	public static void main(String[] args) {
		SpringApplication.run(SquadraApplication.class, args);
	}

}
