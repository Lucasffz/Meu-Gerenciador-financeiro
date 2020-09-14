package com.example.carteirapessoal.service.impl;

import java.util.List;

import com.example.carteirapessoal.model.Despesa;
import com.example.carteirapessoal.repository.DespesaRepository;
import com.example.carteirapessoal.service.DespesaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DespesaServiceImpl implements DespesaService {

    @Autowired
    DespesaRepository despesaRepository;



@Override
public List<Despesa> findAll() {
    return despesaRepository.findAll();
}

@Override
public Despesa save(Despesa despesa) {
    return despesaRepository.save(despesa);
}

@Override
public Despesa findById(Long id) {
    return despesaRepository.findById(id).get();
}







}
