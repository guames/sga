package com.ga.sga.dao;

import com.ga.sga.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioDao extends CrudRepository<Usuario, Long> {
}
