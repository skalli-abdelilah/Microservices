package org.example.inventory_service.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "inventory.params")
public record InventoryConfigParams(int x , String y) {

}
