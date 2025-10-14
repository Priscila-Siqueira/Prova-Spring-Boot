package com.senac.projeto2.repository;

import com.senac.projeto2.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    @Query("SELECT c FROM Categoria c WHERE c.status>=0")
    List<Categoria> buscarRegistros();

    @Query("SELECT c FROM Categoria c WHERE c.status>=0 AND c.id=:id")
    Categoria buscarRegistroPorId(@Param("id") Integer id);

    @Query("UPDATE Categoria c SET c.status=-1 WHERE c.id=:id")
    void apagadoLogico(@Param("id") Integer id);
}
