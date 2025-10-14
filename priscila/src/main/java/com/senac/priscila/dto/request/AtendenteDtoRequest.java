package com.senac.priscila.dto.request;

import com.senac.priscila.entity.RoleName;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public class AtendenteDtoRequest {


    @NotBlank(message= "o nome é obrigatório")
    private String nome;

    @NotBlank(message= "o login é obrigatório")
    private String atendenteUsuarioLogin;

    @NotBlank(message= "a senha é obrigatório")
    private String atendenteChaveAcesso;

    @NotBlank(message= "a data de criação é obrigatório")
    private LocalDate atendenteDataCriacao;

    @NotBlank(message= "o status do usuário é obrigatório")
    private int atendenteAtivo;


    private RoleName roleName;


    public @NotBlank(message = "o nome é obrigatório") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "o nome é obrigatório") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "o login é obrigatório") String getAtendenteUsuarioLogin() {
        return atendenteUsuarioLogin;
    }

    public void setAtendenteUsuarioLogin(@NotBlank(message = "o login é obrigatório") String atendenteUsuarioLogin) {
        this.atendenteUsuarioLogin = atendenteUsuarioLogin;
    }

    public @NotBlank(message = "a senha é obrigatório") String getAtendenteChaveAcesso() {
        return atendenteChaveAcesso;
    }

    public void setAtendenteChaveAcesso(@NotBlank(message = "a senha é obrigatório") String atendenteChaveAcesso) {
        this.atendenteChaveAcesso = atendenteChaveAcesso;
    }

    public @NotBlank(message = "a data de criação é obrigatório") LocalDate getAtendenteDataCriacao() {
        return atendenteDataCriacao;
    }

    public void setAtendenteDataCriacao(@NotBlank(message = "a data de criação é obrigatório") LocalDate atendenteDataCriacao) {
        this.atendenteDataCriacao = atendenteDataCriacao;
    }

    public @NotBlank(message = "o status do usuário é obrigatório") int getAtendenteAtivo() {
        return atendenteAtivo;
    }

    public void setAtendenteAtivo(@NotBlank(message = "o status do usuário é obrigatório") int atendenteAtivo) {
        this.atendenteAtivo = atendenteAtivo;
    }

    public RoleName getRoleName() {
        return roleName;
    }

    public void setRoleName(RoleName roleName) {
        this.roleName = roleName;
    }
}
