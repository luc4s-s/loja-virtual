package com.dev.backendloja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backendloja.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    
}
