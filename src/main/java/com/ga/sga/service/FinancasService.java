package com.ga.sga.service;

import com.ga.sga.domain.Despesa;
import com.ga.sga.domain.Receita;
import com.ga.sga.dto.RelatorioFinancasDTO;
import com.ga.sga.exception.SGAServiceException;

import java.util.Date;
import java.util.List;

public interface FinancasService {

    Despesa salvarDespesa(Despesa despesa) throws SGAServiceException;

    void removerDespesa(Despesa despesa) throws SGAServiceException;

    List<Despesa> listarDespesa() throws SGAServiceException;

    Receita salvarReceita(Receita receita) throws SGAServiceException;

    void removerReceita(Receita receita) throws SGAServiceException;

    List<Receita> listarReceita() throws SGAServiceException;

    List<RelatorioFinancasDTO> relatorioFinancas(Date dataInicial, Date dataFinal) throws SGAServiceException;
}
