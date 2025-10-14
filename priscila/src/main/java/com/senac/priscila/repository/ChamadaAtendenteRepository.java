package com.senac.priscila.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChamadaAtendenteRepository extends JpaRepository<ChamadaAtendenteRepository, Integer> {

    List<ChamadaAtendenteRepository> findAllByAtendenteId(Integer atendenteId);
}
