package com.ga.sga.controller;

import com.ga.sga.domain.Usuario;
import com.ga.sga.exception.SGAServiceException;
import com.ga.sga.service.UsuariosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/usuarios")
public class UsuariosController {

    private UsuariosService uService;

    public UsuariosController(UsuariosService uService) {
        this.uService = uService;
    }

    @GetMapping("/")
    public List<Usuario> listarUsuario() throws SGAServiceException {
        return uService.listarUsuario();
    }
}
