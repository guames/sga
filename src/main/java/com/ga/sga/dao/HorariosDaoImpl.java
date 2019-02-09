package com.ga.sga.dao;

import com.ga.sga.domain.HorarioAgendado;
import com.ga.sga.domain.HorarioDisponivel;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class HorariosDaoImpl implements HorariosDao {

    public List<HorarioAgendado> listarHorarioAgendado() {
        //TODO listar horario agendado
        return new ArrayList<>();
    }

    public HorarioAgendado salvarHorarioAgendado(HorarioAgendado horarioAgendado) {
        //TODO salvar horario agendado
        return new HorarioAgendado();
    }

    public void removerHorarioAgendado(Long id) {
        //TODO remover horario agendado
    }

    public List<HorarioDisponivel> listarHorarioDisponivel() {
        //TODO listar relatorio
        return new ArrayList<>();
    }

    public HorarioDisponivel salvarHorarioDisponivel(HorarioDisponivel horarioDisponivel) {
        //TODO salvar horario agendado
        return new HorarioDisponivel();
    }

    public void removerHorarioDisponivel(Long id) {
        //TODO remover horario agendado
    }
}
