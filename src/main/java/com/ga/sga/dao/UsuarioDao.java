package com.ga.sga.dao;

import com.ga.sga.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface UsuarioDao extends CrudRepository<Usuario, Long> {
}
