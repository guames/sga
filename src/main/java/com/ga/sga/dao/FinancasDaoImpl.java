package com.ga.sga.dao;

import com.ga.sga.domain.Despesa;
import com.ga.sga.domain.Receita;
import com.ga.sga.dto.RelatorioFinancasDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class FinancasDaoImpl implements FinancasDao {

    public List<RelatorioFinancasDTO> relatorioFinancas(Date dataInicial, Date dataFinal) {
        //TODO listar relatorio
        return new ArrayList<>();
    }

    public List<Despesa> listarDespesa() {
        //TODO listar despesas
        return new ArrayList<>();
    }

    public Despesa salvarDespesa(Despesa despesa) {
        //TODO cadastrar despesa
        return new Despesa();
    }

    public void removerDespesa(Long id) {
        //TODO remover despesa
    }

    public List<Receita> listarReceita() {
        //TODO listar receitas
        return new ArrayList<>();
    }

    public Receita salvarReceita(Receita receita) {
        //TODO cadastrar receita
        return new Receita();
    }

    public void removerReceita(Long id) {
        //TODO remover receita
    }
}
