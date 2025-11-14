package org.example.billingservice.entities;

import jakarta.persistence.*;
import lombok.*;
import org.example.billingservice.models.Customer;

import java.util.Date;
import java.util.List;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Bill {
    @Id @GeneratedValue
    private Long id;
    private Date billingDate;
    private long customerId;
    @OneToMany(mappedBy ="bill")
    private List<ProductItem> Productitems;

    @Transient
    private Customer customer;
}
