package com.deyvsonaguiar.pessoasapi.core.useCases;

import com.deyvsonaguiar.pessoasapi.core.entities.Pessoa;

import java.util.List;

public interface GetAllPessoasUseCase {

    public List<Pessoa> execute();
}
