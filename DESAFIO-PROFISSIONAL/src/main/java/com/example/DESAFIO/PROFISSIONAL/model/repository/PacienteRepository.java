package com.example.DESAFIO.PROFISSIONAL.model.repository;

import com.example.DESAFIO.PROFISSIONAL.model.domain.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente,Long>{}
