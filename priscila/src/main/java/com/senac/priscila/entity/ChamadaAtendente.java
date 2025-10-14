package com.senac.priscila.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "chamada_atendente")
public class ChamadaAtendente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "funcionario_id")
    private int id;

    @Column(name = "chamada_atendente_descricao", nullable = false)
    private String chamadaAtendenteDescricao;

    @Column(name = "chamada_atendente_data_abertura", nullable = false)
    private LocalDate chamadaAtendenteDataAbertura;

    @Column(name = "chamada_atendente_data_fechamento", nullable = false)
    private LocalDate chamadaAtendenteDataFechamento;

    @Column(name = "chamada_atendente_status", nullable = false, length = 11)
    private int chamadaAtendenteStatus;

    @ManyToOne
    @JoinColumn(name = "atendente_id")
    @JsonIgnore
    private Atendente atendente;

    public void robertGet() {
    atendente.getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChamadaAtendenteDescricao() {
        return chamadaAtendenteDescricao;
    }

    public void setChamadaAtendenteDescricao(String chamadaAtendenteDescricao) {
        this.chamadaAtendenteDescricao = chamadaAtendenteDescricao;
    }

    public LocalDate getChamadaAtendenteDataAbertura() {
        return chamadaAtendenteDataAbertura;
    }

    public void setChamadaAtendenteDataAbertura(LocalDate chamadaAtendenteDataAbertura) {
        this.chamadaAtendenteDataAbertura = chamadaAtendenteDataAbertura;
    }

    public LocalDate getChamadaAtendenteDataFechamento() {
        return chamadaAtendenteDataFechamento;
    }

    public void setChamadaAtendenteDataFechamento(LocalDate chamadaAtendenteDataFechamento) {
        this.chamadaAtendenteDataFechamento = chamadaAtendenteDataFechamento;
    }

    public int getChamadaAtendenteStatus() {
        return chamadaAtendenteStatus;
    }

    public void setChamadaAtendenteStatus(int chamadaAtendenteStatus) {
        this.chamadaAtendenteStatus = chamadaAtendenteStatus;
    }
}
