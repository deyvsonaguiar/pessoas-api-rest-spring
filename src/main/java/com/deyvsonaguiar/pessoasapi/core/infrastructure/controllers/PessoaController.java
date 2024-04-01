package com.deyvsonaguiar.pessoasapi.core.infrastructure.controllers;

import com.deyvsonaguiar.pessoasapi.core.entities.Pessoa;
import com.deyvsonaguiar.pessoasapi.core.infrastructure.dtos.PessoaDto;
import com.deyvsonaguiar.pessoasapi.core.useCases.CreatePessoaUseCase;
import com.deyvsonaguiar.pessoasapi.core.useCases.GetAllPessoasUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/pessoas")
@AllArgsConstructor
public class PessoaController {

    private final CreatePessoaUseCase createPessoaUseCase;
    private final GetAllPessoasUseCase getAllPessoasUseCase;
    private final PessoaDtoMapper pessoaDtoMapper;

    @PostMapping
    public PessoaDto createPessoa(@RequestBody PessoaDto pessoaDto) {
        Pessoa novaPessoa = createPessoaUseCase.execute(pessoaDtoMapper.toEntity(pessoaDto));
        return pessoaDtoMapper.toDto(novaPessoa);
    }

    @GetMapping
    public List<PessoaDto> obtainAll() {
        return getAllPessoasUseCase.execute()
                .stream().map(pessoaDtoMapper::toDto)
                .collect(Collectors.toList());
    }
}
