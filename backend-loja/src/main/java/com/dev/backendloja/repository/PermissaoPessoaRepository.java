package com.dev.backendloja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backendloja.entity.PermissaoPessoa;

public interface PermissaoPessoaRepository extends JpaRepository<PermissaoPessoa, Long> {
    
}
