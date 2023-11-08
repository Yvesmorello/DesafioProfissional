package com.example.DESAFIO.PROFISSIONAL.model.domain;

import jakarta.persistence.*;
import lombok.NonNull;

@Entity
@Table(name="ubs")
public class Ubs {

    @NonNull
    private String local;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String nome;

    @NonNull
    private String endereco;

    @NonNull
    private String horaFuncionamento;

    public Ubs(String local, String nome, String endereco, String horaFuncionamento) {
        this.local = local;
        this.nome = nome;
        this.endereco = endereco;
        this.horaFuncionamento = horaFuncionamento;
    }

    public Ubs(){

    }


    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getHoraFuncionamento() {
        return horaFuncionamento;
    }

    public void setHoraFuncionamento(String horaFuncionamento) {
        this.horaFuncionamento = horaFuncionamento;
    }
}
