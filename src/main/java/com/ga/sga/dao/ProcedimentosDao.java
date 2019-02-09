package com.ga.sga.dao;

import com.ga.sga.domain.Procedimento;
import java.util.List;

public interface ProcedimentosDao {

    List<Procedimento> listarProcedimento();

    Procedimento salvarProcedimento(Procedimento procedimento);

    void removerProcedimento(Long id);
}
