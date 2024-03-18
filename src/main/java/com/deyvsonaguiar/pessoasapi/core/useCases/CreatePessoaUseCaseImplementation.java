package com.deyvsonaguiar.pessoasapi.core.useCases;

import com.deyvsonaguiar.pessoasapi.core.entities.Pessoa;
import com.deyvsonaguiar.pessoasapi.core.gateways.PessoaGateway;

public class CreatePessoaUseCaseImplementation implements CreatePessoaUseCase {

    private final PessoaGateway pessoaGateway;

    public CreatePessoaUseCaseImplementation(PessoaGateway pessoaGateway) {
        this.pessoaGateway = pessoaGateway;
    }

    @Override
    public Pessoa execute(Pessoa pessoa) {
        return pessoaGateway.createPessoa(pessoa);
    }
}
