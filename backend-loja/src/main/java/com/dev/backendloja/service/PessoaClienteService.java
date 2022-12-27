package com.dev.backendloja.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.backendloja.dto.PessoaClienteRequestDTO;
import com.dev.backendloja.entity.Pessoa;
import com.dev.backendloja.repository.PessoaRepository;

@Service
public class PessoaClienteService {
    
    @Autowired
    private PermissaoPessoaService permissaoPessoaService;

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private EmailService emailService;


    public Pessoa registrar(PessoaClienteRequestDTO pessoaClienteRequestDTO){
        Pessoa pessoa = new PessoaClienteRequestDTO().converter(pessoaClienteRequestDTO);//fazendo a convernçao

        pessoa.setDataCriacao(new Date());
        Pessoa objetoNovo = pessoaRepository.saveAndFlush(pessoa);
        permissaoPessoaService.vincularPessoaPermissaoCliente(objetoNovo);
        emailService.enviarEmailTexto(objetoNovo.getEmail(), "Cadastro na Loja", "O registro na loja foi realizada com sucesso. Em breve receberar uma a senha por E-mail!!");
        return objetoNovo;
    }
}
