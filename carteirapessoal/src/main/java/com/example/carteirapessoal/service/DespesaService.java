package com.example.carteirapessoal.service;

import java.util.List;

import com.example.carteirapessoal.model.Despesa;

public interface DespesaService {
    
    List<Despesa> findAll();
    Despesa findById(Long id);
    Despesa save(Despesa despesa);

    
}
