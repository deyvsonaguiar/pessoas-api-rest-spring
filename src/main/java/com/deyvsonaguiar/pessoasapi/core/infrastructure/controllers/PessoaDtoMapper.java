package com.deyvsonaguiar.pessoasapi.core.infrastructure.controllers;

import com.deyvsonaguiar.pessoasapi.core.entities.Pessoa;
import com.deyvsonaguiar.pessoasapi.core.infrastructure.dtos.PessoaDto;
import org.springframework.stereotype.Component;

@Component
public class PessoaDtoMapper {

    public PessoaDto toDto(Pessoa pessoa) {
        return new PessoaDto(pessoa.nome(), pessoa.email(), pessoa.register(), pessoa.tipo());
    }

    public Pessoa toEntity(PessoaDto pessoaDto) {
        return new Pessoa(null, pessoaDto.nome(), pessoaDto.email(), pessoaDto.register(), pessoaDto.tipo());
    }
}
