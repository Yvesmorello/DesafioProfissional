package com.example.DESAFIO.PROFISSIONAL.controller;

import com.example.DESAFIO.PROFISSIONAL.model.domain.Remedio;
import com.example.DESAFIO.PROFISSIONAL.model.repository.RemedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/remedio")
public class RemedioController {

    @Autowired //CRIANDO UMA INSTANCIA DE REPOSITORY DAI PODE USAR O REPOSITORY NA CLASSE
    private RemedioRepository remedioRepository;

    //LISTAR TODAS AS PESSOAS -> GET
    @GetMapping //anotaçÃO para mapear requisições.
    public List<Remedio> all(){
        return remedioRepository.findAll();
    }

    //PESSOA POR ID -> GET/ID
    @GetMapping("/{id}")//anotaçÃO para mapear requisições
    public Remedio getById(@PathVariable Long id){ //VARIAÇÃO DO CAMINHO - ( O {ID} VAI VIRAR O "LONG ID" )
        return remedioRepository.findById(id).orElse(null);
    }

    //CRIAR PESSOA
    @PostMapping
    public Remedio create(@RequestBody Remedio nova){
        return remedioRepository.save(nova);
    }

    //EDITAR PESSOA -> PUT/ID
    @PutMapping("/{id}")
    public Remedio update(@PathVariable Long id, @RequestBody Remedio update){

        Remedio remedioDb = remedioRepository.findById(id).orElse(new Remedio());

        remedioDb.setId(update.getId());
        remedioDb.setNome(update.getNome());
        remedioDb.setDataValidade(update.getDataValidade());
        remedioDb.setQuantidade(update.getQuantidade());

        return remedioDb;
    }

    //EXCLUIR PESSOA POR ID -> DELET/ID
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        remedioRepository.deleteById(id);
    }

}
