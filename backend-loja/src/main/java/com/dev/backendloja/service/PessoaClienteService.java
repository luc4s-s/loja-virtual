package com.dev.backendloja.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backendloja.dto.PessoaClienteRequestDTO;
import com.dev.backendloja.entity.Pessoa;
import com.dev.backendloja.repository.PessoaClienteRepository;
import com.dev.backendloja.repository.PessoaRepository;

@Service
public class PessoaClienteService {
    
    @Autowired
    private PessoaClienteRepository PessoaClienteRepository;

    @Autowired
    private PermissaoPessoaService permissaoPessoaService;

    @Autowired
    private PessoaRepository pessoaRepository;


    public Pessoa registrar(PessoaClienteRequestDTO pessoaClienteRequestDTO){
        Pessoa pessoa = new PessoaClienteRequestDTO().converter(pessoaClienteRequestDTO);//fazendo a convernçao

        pessoa.setDataCriacao(new Date());
        Pessoa objetoNovo = pessoaRepository.saveAndFlush(pessoa);
        permissaoPessoaService.vincularPessoaPermissaoCliente(pessoa);
        return objetoNovo;
    }
}
