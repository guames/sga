package com.ga.sga.controller;

import com.ga.sga.domain.Despesa;
import com.ga.sga.domain.Receita;
import com.ga.sga.exception.SGAServiceException;
import com.ga.sga.service.FinancasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/financas")
public class FinancasController {

    private FinancasService fService;

    public FinancasController(FinancasService fService) {
        this.fService = fService;
    }

    @GetMapping("/receitas")
    public List<Receita> listarReceita() throws SGAServiceException {
        return fService.listarReceita();
    }

    @GetMapping("/despesas")
    public List<Despesa> listarDespesa() throws SGAServiceException {
        return fService.listarDespesa();
    }
}
