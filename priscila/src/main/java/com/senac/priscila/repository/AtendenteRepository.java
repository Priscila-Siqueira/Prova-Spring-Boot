package com.senac.priscila.repository;

import com.senac.priscila.entity.Atendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AtendenteRepository extends JpaRepository<Atendente, Integer > {

    @Query("SELECT a FROM Atendente a LEFT JOIN FETCH a.chamadaAtendentes")
    List<Atendente> findAllWithChamadasRealizadas();
}
