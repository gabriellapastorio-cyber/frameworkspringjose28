package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

    Optional<List<Cliente>> findByCpf(String cpf);
    
}
