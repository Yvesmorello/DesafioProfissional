package com.example.DESAFIO.PROFISSIONAL.model.repository;

import com.example.DESAFIO.PROFISSIONAL.model.domain.Remedio;
import com.example.DESAFIO.PROFISSIONAL.model.domain.Ubs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UbsRepository extends JpaRepository<Ubs,Long> {}

