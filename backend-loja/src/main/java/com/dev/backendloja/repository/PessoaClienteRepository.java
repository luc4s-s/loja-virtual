package com.dev.backendloja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backendloja.entity.Pessoa;

public interface PessoaClienteRepository extends JpaRepository<Pessoa, Long>{
    
}
