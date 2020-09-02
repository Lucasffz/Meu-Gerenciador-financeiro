package com.example.carteirapessoal.model;

import java.sql.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;



@Entity
@Table(name = "Gastos")
public class Gasto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //geração automatica de id
    private Long id;
    
    @NotBlank
    private String nome;

    @NotBlank
    private double valor;

    @NotBlank
    private Date data;

    private String local;

    private String quantidade;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }



}