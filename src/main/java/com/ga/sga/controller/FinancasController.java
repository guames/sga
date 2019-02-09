package com.ga.sga.controller;

import com.ga.sga.domain.Despesa;
import com.ga.sga.domain.Receita;
import com.ga.sga.dto.RelatorioFinancasDTO;
import com.ga.sga.exception.SGAServiceException;
import com.ga.sga.service.FinancasService;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;

@RestController("/financas")
public class FinancasController {

    private FinancasService fService;

    public FinancasController(FinancasService fService) {
        this.fService = fService;
    }

    @GetMapping("/receitas")
    public List<Receita> listarReceita() throws SGAServiceException {
        return fService.listarReceitas();
    }

    @PutMapping("/receita")
    public Receita cadastrarReceita(Receita receita) throws SGAServiceException {
        return fService.salvarReceita(receita);
    }

    @PostMapping("/receita")
    public Receita salvarReceita(Receita receita) throws SGAServiceException {
        return fService.salvarReceita(receita);
    }

    @DeleteMapping("/receita/{id}")
    public void removerReceita(@RequestParam Long id) throws SGAServiceException {
        fService.removerReceita(id);
    }

    @GetMapping("/despesas")
    public List<Despesa> listarDespesa() throws SGAServiceException {
        return fService.listarDespesas();
    }

    @PutMapping("/despesa")
    public Despesa cadastrarDespesa(Despesa despesa) throws SGAServiceException {
        return fService.salvarDespesa(despesa);
    }

    @PostMapping("/despesa")
    public Despesa salvarDespesa(Despesa despesa) throws SGAServiceException {
        return fService.salvarDespesa(despesa);
    }

    @DeleteMapping("/despesa/{id}")
    public void removerDespesa(@RequestParam Long id) throws SGAServiceException {
        fService.removerDespesa(id);
    }

    @GetMapping("/relatorio")
    public List<RelatorioFinancasDTO> relatorio(Date dataInicial, Date dataFinal) throws SGAServiceException {
        return fService.relatorioFinancas(dataInicial, dataFinal);
    }
}
