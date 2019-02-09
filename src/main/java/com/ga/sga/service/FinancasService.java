package com.ga.sga.service;

import com.ga.sga.domain.Despesa;
import com.ga.sga.domain.Receita;
import com.ga.sga.dto.RelatorioFinancasDTO;
import com.ga.sga.exception.SGAServiceException;

import java.util.Date;
import java.util.List;

public interface FinancasService {

    List<RelatorioFinancasDTO> relatorioFinancas(Date dataInicial, Date dataFinal) throws SGAServiceException;

    List<Despesa> listarDespesas() throws SGAServiceException;

    Despesa salvarDespesa(Despesa despesa) throws SGAServiceException;

    void removerDespesa(Long id) throws SGAServiceException;

    List<Receita> listarReceitas() throws SGAServiceException;

    Receita salvarReceita(Receita receita) throws SGAServiceException;

    void removerReceita(Long id) throws SGAServiceException;

}
