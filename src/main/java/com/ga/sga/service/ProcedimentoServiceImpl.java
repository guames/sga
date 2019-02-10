package com.ga.sga.service;

import com.ga.sga.dao.ProcedimentoDao;
import com.ga.sga.domain.Procedimento;
import com.ga.sga.exception.SGAServiceException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProcedimentoServiceImpl implements ProcedimentoService {

    private ProcedimentoDao pDao;

    public ProcedimentoServiceImpl(ProcedimentoDao pDao) {
        this.pDao = pDao;
    }

    public List<Procedimento> listarProcedimento() throws SGAServiceException {
        try {
            return (List<Procedimento>) pDao.findAll();
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public Procedimento salvarProcedimento(Procedimento procedimento) throws SGAServiceException {
        try {
            return pDao.save(procedimento);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public void removerProcedimento(Long id) throws SGAServiceException {
        try {
            pDao.deleteById(id);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }
}
