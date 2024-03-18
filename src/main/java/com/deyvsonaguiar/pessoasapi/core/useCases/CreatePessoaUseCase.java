package com.deyvsonaguiar.pessoasapi.core.useCases;

import com.deyvsonaguiar.pessoasapi.core.entities.Pessoa;

public interface CreatePessoaUseCase {

    public Pessoa execute(Pessoa pessoa);
}
