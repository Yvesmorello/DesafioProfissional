package com.example.DESAFIO.PROFISSIONAL.controller;

import com.example.DESAFIO.PROFISSIONAL.model.domain.Remedio;
import com.example.DESAFIO.PROFISSIONAL.model.domain.Ubs;
import com.example.DESAFIO.PROFISSIONAL.model.repository.RemedioRepository;
import com.example.DESAFIO.PROFISSIONAL.model.repository.UbsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ubs")
public class UbsController {

    @Autowired
    private UbsRepository ubsRepository;


    @GetMapping
    public List<Ubs> all(){
        return ubsRepository.findAll();
    }


    @GetMapping("/{id}")
    public Ubs getById(@PathVariable Long id){ //VARIAÇÃO DO CAMINHO - ( O {ID} VAI VIRAR O "LONG ID" )
        return ubsRepository.findById(id).orElse(null);
    }


    @PostMapping
    public Ubs create(@RequestBody Ubs nova){
        return ubsRepository.save(nova);
    }


    @PutMapping("/{id}")
    public Ubs update(@PathVariable Long id, @RequestBody Ubs update){

        Ubs ubsDb = ubsRepository.findById(id).orElse(new Ubs());

        ubsDb.setNome(update.getNome());
        ubsDb.setEndereco(update.getEndereco());
        ubsDb.setLocal(update.getLocal());
        ubsDb.setHoraFuncionamento(update.getHoraFuncionamento());

        return ubsDb;
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        ubsRepository.deleteById(id);
    }

}
