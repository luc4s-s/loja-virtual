package com.dev.backendloja.dto;

import org.springframework.beans.BeanUtils;

import com.dev.backendloja.entity.Cidade;
import com.dev.backendloja.entity.Pessoa;

import lombok.Data;

//DTO é um padrao para a transferencia de dados

@Data
public class PessoaClienteRequestDTO {

    private String nome;
    private String cpf;
    private String email;
    private String endereco;
    private String cep;
    private Cidade cidade;

    
    public Pessoa converter(PessoaClienteRequestDTO pessoaClienteRequestDTO){
        Pessoa pessoa = new Pessoa();
        BeanUtils.copyProperties(pessoaClienteRequestDTO, pessoa);//copiando tudo de PessoaClienteRequestDTO para pessoa
        return pessoa;
    }
}
