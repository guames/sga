package com.ga.sga.dto;

import com.ga.sga.domain.Despesa;
import com.ga.sga.domain.Receita;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RelatorioFinancaDTO {

    private Despesa despesa;
    private Receita receita;
}
