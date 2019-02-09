package com.ga.sga.dao;

import com.ga.sga.domain.Despesa;
import com.ga.sga.domain.Receita;
import com.ga.sga.dto.RelatorioFinancasDTO;

import java.util.Date;
import java.util.List;

public interface FinancasDao {

    Despesa salvarDespesa(Despesa despesa);

    void removerDespesa(Despesa despesa);

    List<Despesa> listarDespesa();

    Receita salvarReceita(Receita receita);

    void removerReceita(Receita receita);

    List<Receita> listarReceita();

    List<RelatorioFinancasDTO> relatorioFinancas(Date dataInicial, Date dataFinal);
}
