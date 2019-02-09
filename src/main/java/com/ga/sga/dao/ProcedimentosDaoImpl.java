package com.ga.sga.dao;

import com.ga.sga.domain.Procedimento;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProcedimentosDaoImpl implements ProcedimentosDao {

    public Procedimento salvarProcedimento(Procedimento procedimento){
        //TODO salvar procedimento
        return new Procedimento();
    }

    public void removerProcedimento(Procedimento procedimento){
        //TODO remover procedimento
    }

    public List<Procedimento> listarProcedimento(){
        //TODO listar procedimento
        return new ArrayList<>();
    }
}
