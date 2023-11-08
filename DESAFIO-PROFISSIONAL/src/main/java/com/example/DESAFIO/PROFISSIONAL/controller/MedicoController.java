package com.example.DESAFIO.PROFISSIONAL.controller;

import com.example.DESAFIO.PROFISSIONAL.model.domain.Medico;
import com.example.DESAFIO.PROFISSIONAL.model.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired //CRIANDO UMA INSTANCIA DE REPOSITORY DAI PODE USAR O REPOSITORY NA CLASSE
    private MedicoRepository medicoRepository;

    //LISTAR TODAS OS MEDICOS -> GET
    @GetMapping //anotação para mapear requisições.
    public List<Medico> all(){
        return medicoRepository.findAll();
    }

    //MEDICO POR ID -> GET/ID
    @GetMapping("/{id}")//anotaçÃO para mapear requisições
    public Medico getById(@PathVariable Long id){ //VARIAÇÃO DO CAMINHO - ( O {ID} VAI VIRAR O "LONG ID" )
        return medicoRepository.findById(id).orElse(null);
    }

    //CRIAR MEDICO
    @PostMapping
    public Medico create(@RequestBody Medico nova){
        return medicoRepository.save(nova);
    }

    //EDITAR MEDICO -> PUT/ID
    @PutMapping("/{id}")
    public Medico update(@PathVariable Long id, @RequestBody Medico update){

        Medico medicoDb = medicoRepository.findById(id).orElse(new Medico());

        medicoDb.setCrm(update.getCrm());
        medicoDb.setNome(update.getNome());
        medicoDb.setEspecialidade(update.getEspecialidade());
        medicoDb.setUbsAtua(update.getUbsAtua());

        return medicoDb;
    }

    //EXCLUIR MEDICO POR ID -> DELET/ID
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        medicoRepository.deleteById(id);
    }

}
