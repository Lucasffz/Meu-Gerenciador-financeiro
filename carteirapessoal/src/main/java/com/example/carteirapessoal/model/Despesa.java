package com.example.carteirapessoal.model;

import java.sql.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Despesas")
public class Despesa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //geração automatica de id
    private Long id;
    
    @NotBlank
    private String nome;

    @NotBlank
    @private double valor;

    @NotBlank
    @private Date vencimento;



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

    public Date getVencimento() {
        return this.vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }
    
  
    

}