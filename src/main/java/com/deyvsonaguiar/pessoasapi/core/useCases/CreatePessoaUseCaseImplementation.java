package com.deyvsonaguiar.pessoasapi.core.useCases;

import com.deyvsonaguiar.pessoasapi.core.entities.Pessoa;
import com.deyvsonaguiar.pessoasapi.core.exceptions.BusinessException;
import com.deyvsonaguiar.pessoasapi.core.gateways.PessoaGateway;

public class CreatePessoaUseCaseImplementation implements CreatePessoaUseCase {

    private final PessoaGateway pessoaGateway;

    public CreatePessoaUseCaseImplementation(PessoaGateway pessoaGateway) {
        this.pessoaGateway = pessoaGateway;
    }

    @Override
    public Pessoa execute(Pessoa pessoa) {
        Pessoa pessoaExistente = pessoaGateway.findByCpfCnpj(pessoa.cpfCnpj());
        if(pessoaExistente != null) {
            throw new BusinessException("Já existe uma pessoa cadastrada com este CPF/CNPJ!");
        }
        return pessoaGateway.createPessoa(pessoa);
    }
}
