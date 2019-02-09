package com.ga.sga.dao;

import com.ga.sga.domain.Despesa;
import com.ga.sga.domain.Receita;
import com.ga.sga.dto.RelatorioFinancasDTO;

import java.util.Date;
import java.util.List;

public interface FinancasDao {

    Despesa salvarDespesa(Despesa despesa);

    void removerDespesa(Long id);

    List<Despesa> listarDespesa();

    Receita salvarReceita(Receita receita);

    void removerReceita(Long id);

    List<Receita> listarReceita();

    List<RelatorioFinancasDTO> relatorioFinancas(Date dataInicial, Date dataFinal);
}
