package com.dev.backendloja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backendloja.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long>{
    
}
