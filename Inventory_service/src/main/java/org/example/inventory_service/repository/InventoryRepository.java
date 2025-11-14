package org.example.inventory_service.repository;


import org.example.inventory_service.entities.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
