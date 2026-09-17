package com.example.demo.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Produto;
import com.example.demo.Dto.ProdutoRequest;
import com.example.demo.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    //serve para fazer a injeção da dependência
    private final ProdutoRepository produtoRepository;
    public ProdutoController(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    @PostMapping("/cadastrar")
public void cadastrar(@RequestParam String nome, @RequestParam Double preco,
    @RequestParam Integer quantidade, @RequestParam String setor
    ){
        Produto p1 = new Produto();
        p1.setNome(nome);
        p1.setPreco(preco);
        p1.setQuantidade(quantidade);
        p1.setSetor(setor);

        produtoRepository.save(p1);
        System.out.println("Produto cadastrado com sucesso!!");
    }

    @GetMapping("/BuscarNome")
    public List<Produto> buscarNome(@RequestParam String nome){
        Optional<List<Produto>> listaProdutos = produtoRepository.findByNome(nome);
        if(listaProdutos.isPresent()){
            return listaProdutos.get();
        }
        return null;
    }

    @PostMapping("/deletarProduto")
    public void deletarProduto(@RequestParam Integer id){
       
        Optional<Produto> p = produtoRepository.findById(id);
       
        produtoRepository.deleteById(p.get().getId());
        System.out.println("Produto deletado com sucesso!");

    }

    @PostMapping("/AlterarProduto")
    public void alterarProduto(@RequestBody ProdutoRequest produtoRequest){
        Optional<Produto> p1 = produtoRepository.findById(produtoRequest.getId());
        p1.get().setNome(produtoRequest.getNome());
        p1.get().setPreco(produtoRequest.getPreco());
        p1.get().setQuantidade(produtoRequest.getQuantidade());
        p1.get().setSetor(produtoRequest.getSetor());

        produtoRepository.save(p1);
    }

}