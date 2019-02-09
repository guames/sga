package com.ga.sga.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "horarioAgendado")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HorarioAgendado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dataInicial;
    private Date dataFinal;
    private String titulo;
    private String descricao;
    private Boolean realizado;
    private Double valor;
    private Boolean pago;

    @ManyToOne
    private Procedimento procedimento;
    @ManyToOne
    private Usuario usuario;
}
