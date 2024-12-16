package com.example.Registration2;

import com.example.Registration2.model.RegistrationModel;
import com.example.Registration2.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Registration2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Registration2Application.class, args);
	}

	@Autowired
	private RegistrationService registrationService;

	@Override
	public void run(String... args) throws Exception {
		RegistrationModel registrationModel = new RegistrationModel();
		registrationModel.setName("Elmar");
		registrationModel.setLastName("Jafarli");
		registrationModel.setEmail("Elmar465@gmail.com");
		registrationModel.setPassword(12345);

		registrationService.createCustomer(registrationModel);
	}
}
