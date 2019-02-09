package com.ga.sga.dao;

import com.ga.sga.domain.Despesa;
import com.ga.sga.domain.Receita;
import com.ga.sga.dto.RelatorioFinancasDTO;

import java.util.Date;
import java.util.List;

public interface FinancasDao {

    List<RelatorioFinancasDTO> relatorioFinancas(Date dataInicial, Date dataFinal);

    List<Despesa> listarDespesa();

    Despesa salvarDespesa(Despesa despesa);

    void removerDespesa(Long id);

    List<Receita> listarReceita();

    Receita salvarReceita(Receita receita);

    void removerReceita(Long id);
}
