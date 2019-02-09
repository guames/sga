package com.ga.sga.controller;

import com.ga.sga.domain.HorarioAgendado;
import com.ga.sga.domain.HorarioDisponivel;
import com.ga.sga.exception.SGAServiceException;
import com.ga.sga.service.HorariosService;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/horarioDisponivel")
    public HorarioDisponivel cadastrarHorarioDisponivel(HorarioDisponivel horarioDisponivel) throws SGAServiceException {
        return hService.salvarHorarioDisponivel(horarioDisponivel);
    }

    @PostMapping("/horarioDisponivel")
    public HorarioDisponivel salvarHorarioDisponivel(HorarioDisponivel horarioDisponivel) throws SGAServiceException {
        return hService.salvarHorarioDisponivel(horarioDisponivel);
    }

    @DeleteMapping("/horarioDisponivel/{id}")
    public void removerHorarioDisponivel(@RequestParam Long id) throws SGAServiceException {
        hService.removerHorarioDisponivel(id);
    }

    @GetMapping("/horarioAgendado")
    public List<HorarioAgendado> listarHorarioAgendado() throws SGAServiceException {
        return hService.listarHorarioAgendado();
    }

    @PutMapping("/horarioAgendado")
    public HorarioAgendado cadastrarHorarioAgendado(HorarioAgendado horarioAgendado) throws SGAServiceException {
        return hService.salvarHorarioAgendado(horarioAgendado);
    }

    @PostMapping("/horarioAgendado")
    public HorarioAgendado salvarHorarioAgendado(HorarioAgendado horarioAgendado) throws SGAServiceException {
        return hService.salvarHorarioAgendado(horarioAgendado);
    }

    @DeleteMapping("/horarioAgendado/{id}")
    public void removerHorarioAgendado(@RequestParam Long id) throws SGAServiceException {
        hService.removerHorarioAgendado(id);
    }
}
