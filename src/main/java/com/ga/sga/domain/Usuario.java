package com.ga.sga.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    public enum Role {
        ADMINISTRADOR, USUARIO, CLIENTE
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String senha;
    private String telefone;
    private String endereco;
    private String cpf;
    private Date dataNascimento;

    @OneToMany(mappedBy = "usuario")
    private List<Despesa> despesas;

    @OneToMany(mappedBy = "usuario")
    private List<Receita> receitas;

    @OneToMany(mappedBy = "usuario")
    private List<HorarioAgendado> horariosAgendados;

    @OneToMany(mappedBy = "usuario")
    private List<HorarioDisponivel> horariosDisponiveis;

    @Enumerated(EnumType.STRING)
    private Role role;
}
