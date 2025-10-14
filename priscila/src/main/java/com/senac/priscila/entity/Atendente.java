package com.senac.priscila.entity;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "atendente")
public class Atendente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "atendente_id", length = 11)
    private int id;

    @Column(name = "atendente_nome", nullable = false, length = 200)
    private String nome;

    @Column(name = "atendente_usuario_login", nullable = false, length = 100)
    private String atendenteUsuarioLogin;

    @Column(name = "atendente_chave_acesso", nullable = false)
    private String atendenteChaveAcesso;

    @Column(name = "atendente_data_criacao", nullable = false)
    private LocalDate atendenteDataCriacao;

    @Column(name = "atendente_ativo", nullable = false)
    private int atendenteAtivo;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(name="atendente_role",
            joinColumns = @JoinColumn(name = "atendente_id"),
            inverseJoinColumns = @JoinColumn(name="role_id"))
    private List<Role> roles;

    @OneToMany(mappedBy = "atendente", fetch = FetchType.LAZY)
    private List<ChamadaAtendente> chamadaAtendentes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtendenteChaveAcesso() {
        return atendenteChaveAcesso;
    }

    public void setAtendenteChaveAcesso(String atendenteChaveAcesso) {
        this.atendenteChaveAcesso = atendenteChaveAcesso;
    }

    public LocalDate getAtendenteDataCriacao() {
        return atendenteDataCriacao;
    }

    public void setAtendenteDataCriacao(LocalDate atendenteDataCriacao) {
        this.atendenteDataCriacao = atendenteDataCriacao;
    }

    public int getAtendenteAtivo() {
        return atendenteAtivo;
    }

    public void setAtendenteAtivo(int atendenteAtivo) {
        this.atendenteAtivo = atendenteAtivo;
    }

    public String getAtendenteUsuarioLogin() {
        return atendenteUsuarioLogin;
    }

    public void setAtendenteUsuarioLogin(String atendenteUsuarioLogin) {
        this.atendenteUsuarioLogin = atendenteUsuarioLogin;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<ChamadaAtendente> getChamadaAtendentes() {
        return chamadaAtendentes;
    }

    public void setChamadaAtendentes(List<ChamadaAtendente> chamadaAtendentes) {
        this.chamadaAtendentes = chamadaAtendentes;
    }
}
