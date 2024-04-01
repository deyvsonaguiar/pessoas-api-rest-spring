package com.deyvsonaguiar.pessoasapi.core.infrastructure.gateways;

import com.deyvsonaguiar.pessoasapi.core.entities.Pessoa;
import com.deyvsonaguiar.pessoasapi.core.gateways.PessoaGateway;
import com.deyvsonaguiar.pessoasapi.core.infrastructure.persistence.PessoaEntity;
import com.deyvsonaguiar.pessoasapi.core.infrastructure.persistence.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public Pessoa findByCpfCnpj(String cpfCnpj) {
        PessoaEntity entity =  pessoaRepository.findByCpfCnpj(cpfCnpj);
        if(entity == null) {
            return null;
        }
        return pessoaEntityMapper.toPessoa(entity);
    }

    @Override
    public List<Pessoa> obtainAllPessoas() {
        return pessoaRepository
                .findAll()
                .stream()
                .map(pessoaEntityMapper::toPessoa)
                .collect(Collectors.toList());
    }
}
