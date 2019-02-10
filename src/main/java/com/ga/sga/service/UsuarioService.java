package com.ga.sga.service;

import com.ga.sga.domain.Usuario;
import com.ga.sga.exception.SGAServiceException;

import java.util.List;

public interface UsuarioService {

    List<Usuario> listarUsuario() throws SGAServiceException;

    Usuario salvarUsuario(Usuario usuario) throws SGAServiceException;

    void removerUsuario(Long id) throws SGAServiceException;
}
