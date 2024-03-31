package com.deyvsonaguiar.pessoasapi.core.infrastructure.persistence;

import com.deyvsonaguiar.pessoasapi.core.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
    PessoaEntity findByCpfCnpj(String cpfCnpj);
}
