package com.beinjamin.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.beinjamin.springboot.entity.Employee;
import com.beinjamin.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
    
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		
		
		Employee employee1 = Employee.builder()
				.firstName("Jaures")
				.lastName("FOTSING")
				.email("jauresbeinajmin@gmail.com")
				.proffesion("Döveloppeur Web")
				.build();
		
		Employee employee2 = Employee.builder()
				.firstName("Marc")
				.lastName("Papimouss")
				.email("marc@gmail.com")
				.proffesion("Mecanicien")
				.build();
		
		Employee employee3 = Employee.builder()
				.firstName("Hugorisso")
				.lastName("Ive")
				.email("ive@gmail.com")
				.proffesion("Proffeseur")
				.build();
		Employee employee4 = Employee.builder()
				.firstName("Jobinno")
				.lastName("Karl")
				.email("karl@gmail.com")
				.proffesion("Analyste")
				.build();
		
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
		employeeRepository.save(employee4);



		
		
	}

}
