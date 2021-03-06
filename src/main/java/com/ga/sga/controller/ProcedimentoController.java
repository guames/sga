package com.ga.sga.controller;

import com.ga.sga.domain.Procedimento;
import com.ga.sga.exception.SGAServiceException;
import com.ga.sga.service.ProcedimentoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProcedimentoController {

    private ProcedimentoService pService;

    public ProcedimentoController(ProcedimentoService pService) {
        this.pService = pService;
    }

    @GetMapping("/procedimentos")
    public List<Procedimento> listarProcedimento() throws SGAServiceException {
        return pService.listarProcedimento();
    }

    @PutMapping("/procedimento")
    public Procedimento cadastrarProcedimento(Procedimento procedimento) throws SGAServiceException {
        return pService.salvarProcedimento(procedimento);
    }

    @PostMapping("/procedimento")
    public Procedimento atualizarProcedimento(Procedimento procedimento) throws SGAServiceException {
        return pService.salvarProcedimento(procedimento);
    }

    @DeleteMapping("/procedimento/{id}")
    public void removerProcedimento(@RequestParam Long id) throws SGAServiceException {
        pService.removerProcedimento(id);
    }
}
