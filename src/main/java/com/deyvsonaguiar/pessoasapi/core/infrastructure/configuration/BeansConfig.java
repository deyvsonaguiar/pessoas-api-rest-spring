package com.deyvsonaguiar.pessoasapi.core.infrastructure.configuration;

import com.deyvsonaguiar.pessoasapi.core.gateways.PessoaGateway;
import com.deyvsonaguiar.pessoasapi.core.useCases.CreatePessoaUseCase;
import com.deyvsonaguiar.pessoasapi.core.useCases.CreatePessoaUseCaseImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public CreatePessoaUseCase createPessoaUseCase(PessoaGateway pessoaGateway) {
        return new CreatePessoaUseCaseImplementation(pessoaGateway);
    }
}
