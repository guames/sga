package com.ga.sga.controller;

import com.ga.sga.domain.HorarioAgendado;
import com.ga.sga.domain.HorarioDisponivel;
import com.ga.sga.exception.SGAServiceException;
import com.ga.sga.service.HorariosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/horarios")
public class HorariosController {

    private HorariosService hService;

    public HorariosController(HorariosService hService) {
        this.hService = hService;
    }

    @GetMapping("/disponiveis")
    public List<HorarioDisponivel> listarReceita() throws SGAServiceException {
        return hService.listarHorarioDisponivel();
    }

    @GetMapping("/agendados")
    public List<HorarioAgendado> listarDespesa() throws SGAServiceException {
        return hService.listarHorarioAgendado();
    }
}
