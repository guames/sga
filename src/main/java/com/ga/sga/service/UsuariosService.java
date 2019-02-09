package com.ga.sga.service;

import com.ga.sga.domain.Usuario;
import com.ga.sga.exception.SGAServiceException;

import java.util.List;

public interface UsuariosService {

    Usuario salvarUsuario(Usuario usuario) throws SGAServiceException;

    void removerUsuario(Usuario usuario) throws SGAServiceException;

    List<Usuario> listarUsuario() throws SGAServiceException;
}
