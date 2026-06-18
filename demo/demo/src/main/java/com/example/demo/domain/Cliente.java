package com.example.demo.domain;

import java.math.BigDecimal;

import jakarta.persistence.Entity;

@Entity
public class Cliente {
    
    private Integer id;
    private String nome;
    private String cpf;
    private String email;
    private BigDecimal saldo;

    
    public Cliente() {
    }
    public Cliente(Integer id, String nome, String cpf, String email, BigDecimal saldo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.saldo = saldo;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public BigDecimal getSaldo() {
        return saldo;
    }
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    

}
