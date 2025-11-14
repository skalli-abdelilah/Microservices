package org.example.customer_service;

import org.example.customer_service.entities.customer;
import org.example.customer_service.repositories.custromerrepositorie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
        System.out.println("🚀 Customer Service is running...");
    }

    @Bean
    static CommandLineRunner start(custromerrepositorie customerRepository) {
        return args -> {
            customerRepository.save(customer.builder()
                    .name("Abdelilah Skalli")
                    .email("abdelilah@example.com")
                    .build());

            customerRepository.save(customer.builder()
                    .name("Youssef")
                    .email("youssef@example.com")
                    .build());
            customerRepository.save(customer.builder()
                    .name("hamid")
                    .email("hamid@example.com")
                    .build());

            customerRepository.findAll().forEach(c -> {
                System.out.println("👤 " + c.getName() + " (" + c.getEmail() + ")");
            });
        };
    }


}
