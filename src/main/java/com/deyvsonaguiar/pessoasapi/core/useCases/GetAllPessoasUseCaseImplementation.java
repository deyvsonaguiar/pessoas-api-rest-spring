package com.deyvsonaguiar.pessoasapi.core.useCases;

import com.deyvsonaguiar.pessoasapi.core.entities.Pessoa;
import com.deyvsonaguiar.pessoasapi.core.gateways.PessoaGateway;

import java.util.List;

public class GetAllPessoasUseCaseImplementation implements GetAllPessoasUseCase {

    private final PessoaGateway pessoaGateway;

    public GetAllPessoasUseCaseImplementation(PessoaGateway pessoaGateway) {
        this.pessoaGateway = pessoaGateway;
    }


    @Override
    public List<Pessoa> execute() {
        return pessoaGateway.obtainAllPessoas();
    }
}
