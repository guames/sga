package com.ga.sga.dao;

import com.ga.sga.domain.HorarioAgendado;
import com.ga.sga.domain.HorarioDisponivel;
import java.util.List;

public interface HorariosDao {

    List<HorarioAgendado> listarHorarioAgendado();

    HorarioAgendado salvarHorarioAgendado(HorarioAgendado horarioAgendado);

    void removerHorarioAgendado(Long id);

    List<HorarioDisponivel> listarHorarioDisponivel();

    HorarioDisponivel salvarHorarioDisponivel(HorarioDisponivel horarioDisponivel);

    void removerHorarioDisponivel(Long id);


}
