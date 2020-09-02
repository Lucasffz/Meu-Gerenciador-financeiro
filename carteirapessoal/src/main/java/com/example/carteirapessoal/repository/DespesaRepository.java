package com.example.carteirapessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.carteirapessoal.model.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, Long> {

}