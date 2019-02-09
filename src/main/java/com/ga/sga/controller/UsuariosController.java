package com.ga.sga.controller;

import com.ga.sga.domain.Usuario;
import com.ga.sga.exception.SGAServiceException;
import com.ga.sga.service.UsuariosService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UsuariosController {

    private UsuariosService uService;

    public UsuariosController(UsuariosService uService) {
        this.uService = uService;
    }

    @GetMapping("/usuarios")
    public List<Usuario> listarDespesa() throws SGAServiceException {
        return uService.listarUsuario();
    }

    @PutMapping("/usuario")
    public Usuario cadastrarDespesa(Usuario usuario) throws SGAServiceException {
        return uService.salvarUsuario(usuario);
    }

    @PostMapping("/usuario")
    public Usuario atualizarDespesa(Usuario usuario) throws SGAServiceException {
        return uService.salvarUsuario(usuario);
    }

    @DeleteMapping("/usuario/{id}")
    public void removerUsuario(@RequestParam Long id) throws SGAServiceException {
        uService.removerUsuario(id);
    }
}
