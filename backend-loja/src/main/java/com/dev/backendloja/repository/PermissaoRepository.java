package com.dev.backendloja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backendloja.entity.Permissao;

public interface PermissaoRepository extends JpaRepository<Permissao, Long>{
    
}
