package com.dev.backendloja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.backendloja.dto.PessoaClienteRequestDTO;
import com.dev.backendloja.entity.Pessoa;
import com.dev.backendloja.service.PessoaService;

@RestController
@RequestMapping("/api/cliente")
public class PessoaClienteController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/")
    public Pessoa inserir(@RequestBody PessoaClienteRequestDTO pessoaClienteRequestDTO){//recebendo um DTO
        Pessoa pessoa = new PessoaClienteRequestDTO().converter(pessoaClienteRequestDTO);//fazendo a convernçao
        return pessoaService.inserir(pessoa);// enviando para pessoa como resposta
    }
    
} 
