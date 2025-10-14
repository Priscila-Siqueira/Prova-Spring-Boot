package com.senac.priscila.service;

import com.senac.priscila.dto.request.ChamadaAtendenteDtoRequest;
import com.senac.priscila.dto.response.ChamadaAtendenteDtoResponse;
import com.senac.priscila.entity.Atendente;
import com.senac.priscila.entity.ChamadaAtendente;
import com.senac.priscila.repository.AtendenteRepository;
import com.senac.priscila.repository.ChamadaAtendenteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChamadaAtendenteService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AtendenteRepository atendenteRepository;

    @Autowired
    private ChamadaAtendenteRepository chamadaAtendenteRepository;

//    public List<ChamadaAtendente> buscarChamadasRealizadasPorId(Integer idAtendente){
//        return this.chamadaAtendenteRepository.findAllByAtendenteId((idAtendente));
//    }

//    public ChamadaAtendenteDtoResponse cadastrarChamadaRealizada(ChamadaAtendenteDtoRequest chamadaAtendenteDto){
//
//        Atendente atendente = this.atendenteRepository.findById(chamadaAtendenteDto.getIdAtendente()).orElse(null);
//        atendente.setChamadaAtendentes(chamadaAtendenteDto.getIdAtendente());
//
//        Atendente chamadasAtendentesSalvas = this.chamadaAtendenteRepository.save(atendente);
//
//        return modelMapper.map(chamadasAtendentesSalvas, ChamadaAtendenteDtoResponse.class);
//    }


}
