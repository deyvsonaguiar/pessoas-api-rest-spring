package com.deyvsonaguiar.pessoasapi.core.entities;

import com.deyvsonaguiar.pessoasapi.core.enums.TipoPessoa;

public record Pessoa(
        Long id,
        String nome,
        String email,
        String register,
        TipoPessoa tipo
) {

}