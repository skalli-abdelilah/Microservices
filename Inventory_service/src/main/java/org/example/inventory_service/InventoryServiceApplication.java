package org.example.inventory_service;

import org.example.inventory_service.config.InventoryConfigParams;
import org.example.inventory_service.entities.Inventory;
import org.example.inventory_service.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
@EnableConfigurationProperties(InventoryConfigParams.class)
public class InventoryServiceApplication  {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start (InventoryRepository inventoryRepository) {
        return args -> {
            inventoryRepository.save(Inventory.builder().name("PC" ).price(100*Math.random()).quantity(new Random().nextInt(10)).build());
            inventoryRepository.save(Inventory.builder().name("TEL").price(100*Math.random()).quantity(new Random().nextInt(10)).build());
            inventoryRepository.save(Inventory.builder().name("POS").price(100*Math.random()).quantity(new Random().nextInt(10)).build());

            inventoryRepository.findAll().forEach(inventory -> {
                System.out.println("<UNK> " + inventory.getName() + " (" + inventory.getPrice() + ")");
            });
        };
    }

}
