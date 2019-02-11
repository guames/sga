package com.ga.sga.controller;

import com.ga.sga.domain.Usuario;
import com.ga.sga.exception.SGAServiceException;
import com.ga.sga.service.UsuarioService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UsuarioController {

    private UsuarioService uService;

    public UsuarioController(UsuarioService uService) {
        this.uService = uService;
    }

    @GetMapping("/usuarios")
    public ModelAndView listarUsuario() throws SGAServiceException {
        ModelAndView modelAndView = new ModelAndView("/usuario/lista");
        modelAndView.addObject("listaUsuarios",uService.listarUsuario());
        return modelAndView;
    }

    @PutMapping("/usuario")
    public Usuario cadastrarUsuario(Usuario usuario) throws SGAServiceException {
        return uService.salvarUsuario(usuario);
    }

    @PostMapping("/usuario")
    public Usuario atualizarUsuario(Usuario usuario) throws SGAServiceException {
        return uService.salvarUsuario(usuario);
    }

    @DeleteMapping("/usuario/{id}")
    public void removerUsuario(@RequestParam Long id) throws SGAServiceException {
        uService.removerUsuario(id);
    }
}
