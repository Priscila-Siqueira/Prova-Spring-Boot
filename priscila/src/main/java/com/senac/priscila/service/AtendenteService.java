package com.senac.priscila.service;

import com.senac.priscila.dto.request.AtendenteDtoRequest;
import com.senac.priscila.dto.response.AtendenteDtoResponse;
import com.senac.priscila.entity.Atendente;
import com.senac.priscila.entity.Role;
import com.senac.priscila.repository.AtendenteRepository;
import com.senac.priscila.repository.RoleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtendenteService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AtendenteRepository atendenteRepository;

    @Autowired
    private RoleRepository roleRepository;

    public List<Atendente> listarAtendentesComChamadasRealizas(){

        return atendenteRepository.findAllWithChamadasRealizadas();
    }

    public Atendente consultarAtendentePorId(Integer idAtendente){
        return this.atendenteRepository.findById(idAtendente).orElse(null);
    }

    public AtendenteDtoResponse cadastrarAtendente(AtendenteDtoRequest atendenteDto) {

        Role role = (Role) this.roleRepository.findByName(atendenteDto.getRoleName());

        Atendente atendente = new Atendente();
        atendente.setAtendenteUsuarioLogin(atendenteDto.getAtendenteUsuarioLogin());
        atendente.setAtendenteChaveAcesso(atendenteDto.getAtendenteChaveAcesso());
        atendente.setNome(atendenteDto.getNome());
        atendente.setAtendenteDataCriacao(atendenteDto.getAtendenteDataCriacao());
        atendente.setAtendenteAtivo(1);

        atendente.setRoles(List.of(role));

        Atendente atendenteSalvo = this.atendenteRepository.save(atendente);

        return modelMapper.map(atendenteSalvo, AtendenteDtoResponse.class);
    }


    public void alterarStatus(Integer idAtendente, Integer status){
        Atendente atendenteExistente = this.atendenteRepository.findById(idAtendente).orElse(null);

        if (atendenteExistente == null) {
            return;
        }

        atendenteExistente.setAtendenteAtivo(status);
        this.atendenteRepository.save(atendenteExistente);


    }



}
