package com.dev.backendloja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backendloja.entity.ProdutoImagens;

public interface ProdutoImagensRepository extends JpaRepository<ProdutoImagens, Long>{
    
}
