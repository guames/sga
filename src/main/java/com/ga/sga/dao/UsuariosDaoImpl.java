package com.ga.sga.dao;

import com.ga.sga.domain.Usuario;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuariosDaoImpl implements UsuariosDao {

    public Usuario salvarUsuario(Usuario usuario){
        //TODO salvar usuario
        return new Usuario();
    }

    public void removerUsuario(Usuario usuario){
        //TODO remover usuario
    }

    public List<Usuario> listarUsuario(){
        //TODO listar usuario
        return new ArrayList<>();
    }
}
