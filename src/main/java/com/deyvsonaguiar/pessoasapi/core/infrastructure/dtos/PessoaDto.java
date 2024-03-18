package com.deyvsonaguiar.pessoasapi.core.infrastructure.dtos;

import com.deyvsonaguiar.pessoasapi.core.enums.TipoPessoa;

public record PessoaDto(String nome, String email, String register, TipoPessoa tipo){}
