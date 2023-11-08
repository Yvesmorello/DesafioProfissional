package com.example.DESAFIO.PROFISSIONAL.controller;


//import com.example.DESAFIO.PROFISSIONAL.model.repository.PacienteRepository;
import com.example.DESAFIO.PROFISSIONAL.model.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired //CRIANDO UMA INSTANCIA DE REPOSITORY DAI PODE USAR O REPOSITORY NA CLASSE
    private PacienteRepository pacienteRepository;

    @GetMapping
    public ModelAndView all(){
        ModelAndView view = new ModelAndView("paciente");
        view.addObject("pacientes", pacienteRepository.findAll());

        return view;
    }

//    //LISTAR TODAS OS PACIENTES -> GET
//    @GetMapping //anotaçÃO para mapear requisições.
//    public List<Paciente> all(){
//        return pacienteRepository.findAll();
//    }

//    //PACIENTES POR ID -> GET/ID
//    @GetMapping("/{id}")//anotaçÃO para mapear requisições
//    public Paciente getById(@PathVariable Long id){ //VARIAÇÃO DO CAMINHO - ( O {ID} VAI VIRAR O "LONG ID" )
//        return pacienteRepository.findById(id).orElse(null);
//    }
//
//    //CRIAR PACIENTES
//    @PostMapping
//    public Paciente create(@RequestBody Paciente nova){
//        return pacienteRepository.save(nova);
//    }
//
//    //EDITAR PACIENTES -> PUT/ID
//    @PutMapping("/{id}")
//    public Paciente update(@PathVariable Long id, @RequestBody Paciente update){
//
//       Paciente pacienteDb = pacienteRepository.findById(id).orElse(new Paciente());
//
//        pacienteDb.setId(update.getId());
//        pacienteDb.setNome(update.getNome());
//        pacienteDb.setDocumento(update.getDocumento());
//        pacienteDb.setTelefone(update.getTelefone());
//        pacienteDb.setEndereco(update.getEndereco());
//        pacienteDb.setDataNascimento(update.getDataNascimento());
//
//        return pacienteDb;
//    }
//
//    //EXCLUIR PACIENTES POR ID -> DELET/ID
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable Long id){
//        pacienteRepository.deleteById(id);
//    }

}
