package com.ga.sga.dao;

import com.ga.sga.domain.Procedimento;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProcedimentosDaoImpl implements ProcedimentosDao {

    public List<Procedimento> listarProcedimento(){
        //TODO listar procedimento
        return new ArrayList<>();
    }

    public Procedimento salvarProcedimento(Procedimento procedimento){
        //TODO salvar procedimento
        return new Procedimento();
    }

    public void removerProcedimento(Long id){
        //TODO remover procedimento
    }
}
