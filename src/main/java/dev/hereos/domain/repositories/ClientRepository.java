package dev.hereos.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.hereos.domain.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
