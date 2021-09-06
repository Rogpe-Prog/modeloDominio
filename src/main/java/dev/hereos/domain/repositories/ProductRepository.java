package dev.hereos.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.hereos.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
