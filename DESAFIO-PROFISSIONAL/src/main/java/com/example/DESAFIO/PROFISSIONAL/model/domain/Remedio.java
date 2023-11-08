package com.example.DESAFIO.PROFISSIONAL.model.domain;

import jakarta.persistence.*;
import lombok.NonNull;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;

@Entity
@Table(name="remedio")
public class Remedio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String nome;

    @NonNull
    private String dataValidade;

    @NumberFormat
    private int quantidade;

    public Remedio(String nome, String dataValidade, int quantidade){
        this.nome = nome;
        this.dataValidade = dataValidade;
        this.quantidade = quantidade;
    }

    public Remedio(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

