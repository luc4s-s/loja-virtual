package com.dev.backendloja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backendloja.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
    
}
