package com.dev.backendloja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.backendloja.entity.Permissao;

public interface PermissaoRepository extends JpaRepository<Permissao, Long>{

    List<Permissao> findByNome(String nome);
    
}
