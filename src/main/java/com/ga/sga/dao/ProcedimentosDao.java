package com.ga.sga.dao;

import com.ga.sga.domain.Procedimento;
import java.util.List;

public interface ProcedimentosDao {

    Procedimento salvarProcedimento(Procedimento procedimento);

    void removerProcedimento(Procedimento procedimento);

    List<Procedimento> listarProcedimento();
}
