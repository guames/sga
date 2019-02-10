package com.ga.sga.dao;

import com.ga.sga.domain.Receita;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface ReceitaDao extends CrudRepository<Receita, Long> {
}
