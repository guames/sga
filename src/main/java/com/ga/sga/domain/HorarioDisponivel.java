package com.ga.sga.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "horarioDisponivel")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HorarioDisponivel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dataInicial;
    private Date dataFinal;
    private String titulo;
    private String descricao;

    @ManyToOne
    private Procedimento procedimento;

    @ManyToOne
    private Usuario usuario;
}
