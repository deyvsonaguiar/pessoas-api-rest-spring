package com.deyvsonaguiar.pessoasapi.core.infrastructure.gateways;

import com.deyvsonaguiar.pessoasapi.core.entities.Pessoa;
import com.deyvsonaguiar.pessoasapi.core.gateways.PessoaGateway;
import com.deyvsonaguiar.pessoasapi.core.infrastructure.persistence.PessoaEntity;
import com.deyvsonaguiar.pessoasapi.core.infrastructure.persistence.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PessoaRepositoryGateway implements PessoaGateway {

    private final PessoaRepository pessoaRepository;
    private final PessoaEntityMapper pessoaEntityMapper;

    @Override
    public Pessoa createPessoa(Pessoa pessoa) {
        PessoaEntity entity = pessoaEntityMapper.toEntity(pessoa);
        PessoaEntity novaPessoa = pessoaRepository.save(entity);
        return pessoaEntityMapper.toPessoa(novaPessoa);
    }
}
