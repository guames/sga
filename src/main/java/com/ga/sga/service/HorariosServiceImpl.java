package com.ga.sga.service;

import com.ga.sga.dao.HorariosDao;
import com.ga.sga.domain.HorarioAgendado;
import com.ga.sga.domain.HorarioDisponivel;
import com.ga.sga.exception.SGAServiceException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HorariosServiceImpl implements HorariosService{

    private HorariosDao hDao;

    public HorariosServiceImpl(HorariosDao hDao){
        this.hDao = hDao;
    }

    public List<HorarioAgendado> listarHorarioAgendado() throws SGAServiceException {
        try {
            return hDao.listarHorarioAgendado();
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public HorarioAgendado salvarHorarioAgendado(HorarioAgendado horarioAgendado) throws SGAServiceException {
        try {
            return hDao.salvarHorarioAgendado(horarioAgendado);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public void removerHorarioAgendado(Long id) throws SGAServiceException {
        try {
            hDao.removerHorarioAgendado(id);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public List<HorarioDisponivel> listarHorarioDisponivel() throws SGAServiceException {
        try {
            return hDao.listarHorarioDisponivel();
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public HorarioDisponivel salvarHorarioDisponivel(HorarioDisponivel horarioDisponivel) throws SGAServiceException {
        try {
            return hDao.salvarHorarioDisponivel(horarioDisponivel);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public void removerHorarioDisponivel(Long id) throws SGAServiceException {
        try {
            hDao.removerHorarioDisponivel(id);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }
}
