package com.ga.sga.service;

import com.ga.sga.dao.DespesaDao;
import com.ga.sga.dao.ReceitaDao;
import com.ga.sga.domain.Despesa;
import com.ga.sga.domain.Receita;
import com.ga.sga.dto.RelatorioFinancasDTO;
import com.ga.sga.exception.SGAServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FinancaServiceImpl implements FinancaService{

    private ReceitaDao rDao;
    private DespesaDao dDao;

    @Autowired
    public FinancaServiceImpl(ReceitaDao rDao, DespesaDao dDao) {
        this.rDao = rDao;
        this.dDao = dDao;
    }

    public List<RelatorioFinancasDTO> relatorioFinancas(Date dataInicial, Date dataFinal) throws SGAServiceException {
        try {
//            return fDao.relatorioFinancas(dataInicial, dataFinal);
            return new ArrayList<>();
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public List<Despesa> listarDespesas() throws SGAServiceException {
        try {
            return (List<Despesa>) dDao.findAll();
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public Despesa salvarDespesa(Despesa despesa) throws SGAServiceException {
        try {
            return dDao.save(despesa);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public void removerDespesa(Long id) throws SGAServiceException {
        try {
            dDao.deleteById(id);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public List<Receita> listarReceitas() throws SGAServiceException {
        try {
            return (List<Receita>) rDao.findAll();
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public Receita salvarReceita(Receita receita) throws SGAServiceException {
        try {
            return rDao.save(receita);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }

    public void removerReceita(Long id) throws SGAServiceException {
        try {
            rDao.deleteById(id);
        } catch (Exception e) {
            throw new SGAServiceException(e.getMessage());
        }
    }
}
