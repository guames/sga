package com.ga.sga.dao;

import com.ga.sga.domain.HorarioDisponivel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface HorarioDisponivelDao extends CrudRepository<HorarioDisponivel, Long> {
}
