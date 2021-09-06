package dev.hereos.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.hereos.domain.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
