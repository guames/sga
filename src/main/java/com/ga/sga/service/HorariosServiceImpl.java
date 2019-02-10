package com.ga.sga.service;

import com.ga.sga.dao.HorarioAgendadoDao;
import com.ga.sga.dao.HorarioDisponivelDao;
import com.ga.sga.domain.HorarioAgendado;
import com.ga.sga.domain.HorarioDisponivel;
import com.ga.sga.exception.SGAServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HorariosServiceImpl implements HorariosService{

    private HorarioAgendadoDao hADao;
    private HorarioDisponivelDao hDDao;

    @Autowired
    public HorariosServiceImpl(HorarioAgendadoDao hADao,HorarioDisponivelDao hDDao){
        this.hADao = hADao;
        this.hDDao = hDDao;
    }

    public List<HorarioAgendado> listarHorarioAgendado() throws SGAServiceException {
        try {
            return (List<HorarioAgendado>) hADao.findAll();
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public HorarioAgendado salvarHorarioAgendado(HorarioAgendado horarioAgendado) throws SGAServiceException {
        try {
            return hADao.save(horarioAgendado);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public void removerHorarioAgendado(Long id) throws SGAServiceException {
        try {
            hADao.deleteById(id);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public List<HorarioDisponivel> listarHorarioDisponivel() throws SGAServiceException {
        try {
            return (List<HorarioDisponivel>) hDDao.findAll();
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public HorarioDisponivel salvarHorarioDisponivel(HorarioDisponivel horarioDisponivel) throws SGAServiceException {
        try {
            return hDDao.save(horarioDisponivel);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public void removerHorarioDisponivel(Long id) throws SGAServiceException {
        try {
            hDDao.deleteById(id);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }
}
