package com.example.DESAFIO.PROFISSIONAL.model.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.format.annotation.NumberFormat;

@Entity
@Table(name="medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private Long crm;

    @NonNull
    private String nome;

    @NonNull
    private int idade;

    @NonNull
    private String especialidade;

    @NonNull
    private String ubsAtua;

    public Medico(Long crm, String nome, int idade, String especialidade, String ubsAtua) {
        this.crm = crm;
        this.nome = nome;
        this.idade = idade;
        this.especialidade = especialidade;
        this.ubsAtua = ubsAtua;
    }

    public Medico(){

    }

    public Long getCrm() {
        return crm;
    }

    public void setCrm(Long crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getUbsAtua() {
        return ubsAtua;
    }

    public void setUbsAtua(String ubsAtua) {
        this.ubsAtua = ubsAtua;
    }
}
