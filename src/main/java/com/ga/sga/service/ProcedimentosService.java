package com.ga.sga.service;

import com.ga.sga.domain.Procedimento;
import com.ga.sga.exception.SGAServiceException;
import java.util.List;

public interface ProcedimentosService {

    List<Procedimento> listarProcedimento() throws SGAServiceException;

    Procedimento salvarProcedimento(Procedimento procedimento) throws SGAServiceException;

    void removerProcedimento(Long id) throws SGAServiceException;
}
