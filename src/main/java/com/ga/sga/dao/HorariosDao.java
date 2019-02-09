package com.ga.sga.dao;

import com.ga.sga.domain.HorarioAgendado;
import com.ga.sga.domain.HorarioDisponivel;
import java.util.List;

public interface HorariosDao {

    HorarioAgendado salvarHorarioAgendado(HorarioAgendado horarioAgendado);

    void removerHorarioAgendado(HorarioAgendado horarioAgendado);

    List<HorarioAgendado> listarHorarioAgendado();

    HorarioDisponivel salvarHorarioDisponivel(HorarioDisponivel horarioDisponivel);

    void removerHorarioDisponivel(HorarioDisponivel horarioDisponivel);

    List<HorarioDisponivel> listarHorarioDisponivel();
}
