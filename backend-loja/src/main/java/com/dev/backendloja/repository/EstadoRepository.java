package com.dev.backendloja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backendloja.entity.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{

    //consulta personalizada
    
}
