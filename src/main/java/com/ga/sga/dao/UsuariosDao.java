package com.ga.sga.dao;

import com.ga.sga.domain.Usuario;
import java.util.List;

public interface UsuariosDao {

    List<Usuario> listarUsuario();

    Usuario salvarUsuario(Usuario usuario);

    void removerUsuario(Long id);
}
