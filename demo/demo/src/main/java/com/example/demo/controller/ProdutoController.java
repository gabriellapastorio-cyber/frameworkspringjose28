package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Produto;

@RestController
@RequestMapping("/Produto")

public class ProdutoController {
    

    @PostMapping("/cadastrar")
    public static void cadastrar(Produto produto){

    }
}
