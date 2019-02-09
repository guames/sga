package com.ga.sga.service;

import com.ga.sga.dao.FinancasDao;
import com.ga.sga.domain.Despesa;
import com.ga.sga.domain.Receita;
import com.ga.sga.dto.RelatorioFinancasDTO;
import com.ga.sga.exception.SGAServiceException;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Service
public class FinancasServiceImpl implements FinancasService {

    private FinancasDao fDao;

    public FinancasServiceImpl(FinancasDao fDao) {
        this.fDao = fDao;
    }

    public List<RelatorioFinancasDTO> relatorioFinancas(Date dataInicial, Date dataFinal) throws SGAServiceException {
        try {
            return fDao.relatorioFinancas(dataInicial, dataFinal);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public List<Despesa> listarDespesas() throws SGAServiceException {
        try {
            return fDao.listarDespesa();
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public Despesa salvarDespesa(Despesa despesa) throws SGAServiceException {
        try {
            return fDao.salvarDespesa(despesa);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public void removerDespesa(Long id) throws SGAServiceException {
        try {
            fDao.removerDespesa(id);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public List<Receita> listarReceitas() throws SGAServiceException {
        try {
            return fDao.listarReceita();
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public Receita salvarReceita(Receita receita) throws SGAServiceException {
        try {
            return fDao.salvarReceita(receita);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public void removerReceita(Long id) throws SGAServiceException {
        try {
            fDao.removerReceita(id);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }
}
