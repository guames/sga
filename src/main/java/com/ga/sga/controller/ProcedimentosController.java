package com.ga.sga.controller;

import com.ga.sga.domain.Procedimento;
import com.ga.sga.exception.SGAServiceException;
import com.ga.sga.service.ProcedimentosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/procedimentos")
public class ProcedimentosController {

    private ProcedimentosService pService;

    public ProcedimentosController(ProcedimentosService pService) {
        this.pService = pService;
    }

    @GetMapping("/q")
    public List<Procedimento> listarProcedimento() throws SGAServiceException {
        return pService.listarProcedimento();
    }
}
