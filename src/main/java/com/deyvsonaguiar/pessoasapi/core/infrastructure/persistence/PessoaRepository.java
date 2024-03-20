package com.deyvsonaguiar.pessoasapi.core.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
}
