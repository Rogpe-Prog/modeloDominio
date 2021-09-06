package dev.hereos.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.hereos.domain.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
