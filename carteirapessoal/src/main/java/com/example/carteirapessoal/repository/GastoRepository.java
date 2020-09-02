package com.example.carteirapessoal.repository;

import com.example.carteirapessoal.model.Gasto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GastoRepository extends JpaRepository<Gasto, Long> {
        
}
