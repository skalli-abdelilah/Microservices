package org.example.inventory_service.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Builder @NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Inventory {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private int quantity;
    private double price;
}
