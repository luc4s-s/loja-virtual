package com.dev.backendloja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backendloja.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
