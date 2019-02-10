package com.ga.sga.dao;

import com.ga.sga.domain.HorarioAgendado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioAgendadoDao extends CrudRepository<HorarioAgendado, Long> {
}
