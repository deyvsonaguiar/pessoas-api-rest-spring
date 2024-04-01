package com.deyvsonaguiar.pessoasapi.core.gateways;

import com.deyvsonaguiar.pessoasapi.core.entities.Pessoa;

import java.util.List;

public interface PessoaGateway {

    Pessoa createPessoa(Pessoa pessoa);

    Pessoa findByCpfCnpj(String cpfCnpj);

    List<Pessoa> obtainAllPessoas();
}
