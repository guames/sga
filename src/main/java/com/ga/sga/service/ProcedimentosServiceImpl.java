package com.ga.sga.service;

import com.ga.sga.dao.ProcedimentosDao;
import com.ga.sga.domain.Procedimento;
import com.ga.sga.exception.SGAServiceException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProcedimentosServiceImpl implements ProcedimentosService{

    private ProcedimentosDao pDao;

    public ProcedimentosServiceImpl(ProcedimentosDao pDao) {
        this.pDao = pDao;
    }

    public Procedimento salvarProcedimento(Procedimento procedimento) throws SGAServiceException {
        try {
            return pDao.salvarProcedimento(procedimento);
        } catch (Exception e) {
            throw new SGAServiceException();
        }
    }

    public void removerProcedimento(Procedimento procedimento) throws SGAServiceException {
        try {
            pDao.removerProcedimento(procedimento);
        } catch (Exception e) {
            throw new SGAServiceException();
        }
    }

    public List<Procedimento> listarProcedimento() throws SGAServiceException {
        try {
            return pDao.listarProcedimento();
        } catch (Exception e) {
            throw new SGAServiceException();
        }
    }
}
