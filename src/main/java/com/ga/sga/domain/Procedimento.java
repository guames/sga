package com.ga.sga.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "procedimento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Procedimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private Double valorSugerido;

    @OneToMany(mappedBy = "procedimento")
    private List<HorarioAgendado> horariosAgendados;
    @OneToMany(mappedBy = "procedimento")
    private List<HorarioDisponivel> horariosDisponiveis;
}
