package com.senac.priscila.dto.request;


import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public class ChamadaAtendenteDtoRequest {

    @NotBlank(message= "a Descrição é obrigatório")
    private String chamadaAtendenteDescricao;

    @NotBlank(message= "a data de abertura é obrigatório")
    private LocalDate chamadaAtendenteDataAbertura;

    @NotBlank(message= "a data de fechamento é obrigatório")
    private LocalDate chamadaAtendenteDataFechamento;

    @NotBlank(message= "o status é obrigatório")
    private int chamadaAtendenteStatus;

    private int idAtendente;


    public @NotBlank(message = "a Descrição é obrigatório") String getChamadaAtendenteDescricao() {
        return chamadaAtendenteDescricao;
    }

    public void setChamadaAtendenteDescricao(@NotBlank(message = "a Descrição é obrigatório") String chamadaAtendenteDescricao) {
        this.chamadaAtendenteDescricao = chamadaAtendenteDescricao;
    }


    public @NotBlank(message = "o status é obrigatório") int getChamadaAtendenteStatus() {
        return chamadaAtendenteStatus;
    }

    public void setChamadaAtendenteStatus(@NotBlank(message = "o status é obrigatório") int chamadaAtendenteStatus) {
        this.chamadaAtendenteStatus = chamadaAtendenteStatus;
    }

    public @NotBlank(message = "a data de fechamento é obrigatório") LocalDate getChamadaAtendenteDataFechamento() {
        return chamadaAtendenteDataFechamento;
    }

    public void setChamadaAtendenteDataFechamento(@NotBlank(message = "a data de fechamento é obrigatório") LocalDate chamadaAtendenteDataFechamento) {
        this.chamadaAtendenteDataFechamento = chamadaAtendenteDataFechamento;
    }

    public @NotBlank(message = "a data de abertura é obrigatório") LocalDate getChamadaAtendenteDataAbertura() {
        return chamadaAtendenteDataAbertura;
    }

    public void setChamadaAtendenteDataAbertura(@NotBlank(message = "a data de abertura é obrigatório") LocalDate chamadaAtendenteDataAbertura) {
        this.chamadaAtendenteDataAbertura = chamadaAtendenteDataAbertura;
    }

    public int getIdAtendente() {
        return idAtendente;
    }

    public void setIdAtendente(int idAtendente) {
        this.idAtendente = idAtendente;
    }
}


