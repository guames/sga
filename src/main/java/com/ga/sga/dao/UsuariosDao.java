package com.ga.sga.dao;

import com.ga.sga.domain.Usuario;
import java.util.List;

public interface UsuariosDao {

    Usuario salvarUsuario(Usuario usuario);

    void removerUsuario(Usuario usuario);

    List<Usuario> listarUsuario();
}
