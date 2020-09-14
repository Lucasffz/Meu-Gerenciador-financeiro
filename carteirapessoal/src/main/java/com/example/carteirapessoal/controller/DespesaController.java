package com.example.carteirapessoal.controller;

import com.example.carteirapessoal.service.DespesaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

import com.example.carteirapessoal.model.Despesa;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DespesaController {

    @Autowired
    DespesaService despesaService;

    @RequestMapping( value = "/despesas", method = RequestMethod.GET)
    public ModelAndView getDespesas(){
        ModelAndView mv = new ModelAndView("despesas");
        List<Despesa> despesas = despesaService.findAll();
        mv.addObject("despesas", despesas);
        return mv;
    }

    @RequestMapping( value = "despesas/{id}", method = RequestMethod.GET)
    public ModelAndView getDespesa(@PathVariable("id"), long id){
        ModelAndView mv = new ModelAndView("despesa");
        Despesa despesa = despesaService.findById(id);
        mv.addObject("despesa", despesa);
        return mv;
    }

    
}


