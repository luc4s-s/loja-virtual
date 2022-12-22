package com.dev.backendloja.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dev.backendloja.entity.Produto;
import com.dev.backendloja.entity.ProdutoImagens;
import com.dev.backendloja.repository.ProdutoImagensRepository;
import com.dev.backendloja.repository.ProdutoRepository;

@Service
public class ProdutoImagensService {
    
    @Autowired
    private ProdutoImagensRepository produtoImagensRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoImagens> buscarTodods(){
        return produtoImagensRepository.findAll();
    }

    public ProdutoImagens inserir(Long idProduto, MultipartFile file){
        Produto produto = produtoRepository.findById(idProduto).get();
        ProdutoImagens objeto = new ProdutoImagens();

        try {
			if (!file.isEmpty()) {
				byte[] bytes = file.getBytes();
                String nomeImagem = String.valueOf(produto.getId()) + " " + file.getOriginalFilename();
				Path caminho = Paths
						.get("c:/imagens/" + nomeImagem );//caminho da imagens
				Files.write(caminho, bytes);//Gravando no caminho da imagem
                objeto.setNome(nomeImagem);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

        objeto.setProduto(produto);
        objeto.setDataCriacao(new Date());
        objeto = produtoImagensRepository.saveAndFlush(objeto);
        return objeto;
    }

    public ProdutoImagens alterar(ProdutoImagens objeto){
        objeto.setDataAtualizacao(new Date());
        return produtoImagensRepository.saveAndFlush(objeto);
    }

    public void excluir(Long id){
        ProdutoImagens objeto = produtoImagensRepository.findById(id).get();
        produtoImagensRepository.delete(objeto);
    }
}
