package com.ga.sga.service;

import com.ga.sga.domain.HorarioAgendado;
import com.ga.sga.domain.HorarioDisponivel;
import com.ga.sga.exception.SGAServiceException;

import java.util.List;

public interface HorariosService {

    HorarioAgendado salvarHorarioAgendado(HorarioAgendado horarioAgendado) throws SGAServiceException;

    void removerHorarioAgendado(Long id) throws SGAServiceException;

    List<HorarioAgendado> listarHorarioAgendado() throws SGAServiceException;

    HorarioDisponivel salvarHorarioDisponivel(HorarioDisponivel horarioDisponivel) throws SGAServiceException;

    void removerHorarioDisponivel(Long id) throws SGAServiceException;

    List<HorarioDisponivel> listarHorarioDisponivel() throws SGAServiceException;
}
