package com.example.carteirapessoal.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Investimentos")
public class Investimento{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String nome;
    @NotBlank
    private String tipo;
    @NotBlank
    private double valor;
    @NotBlank
    private double rendimento;


}