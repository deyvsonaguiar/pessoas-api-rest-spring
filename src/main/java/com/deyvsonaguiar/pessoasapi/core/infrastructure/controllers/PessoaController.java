package com.deyvsonaguiar.pessoasapi.core.infrastructure.controllers;

import com.deyvsonaguiar.pessoasapi.core.entities.Pessoa;
import com.deyvsonaguiar.pessoasapi.core.infrastructure.dtos.PessoaDto;
import com.deyvsonaguiar.pessoasapi.core.useCases.CreatePessoaUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pessoas")
@AllArgsConstructor
public class PessoaController {

    private final CreatePessoaUseCase createPessoaUseCase;
    private final PessoaDtoMapper pessoaDtoMapper;

    @PostMapping
    public PessoaDto createPessoa(@RequestBody, PessoaDto pessoaDto) {
        Pessoa novaPessoa = createPessoaUseCase.execute(pessoaDtoMapper.toEntity(pessoaDto));
        return pessoaDtoMapper.toDto(novaPessoa);
    }
}
