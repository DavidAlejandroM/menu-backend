package com.amti;

import com.amti.model.negocio.NegocioRepository;
import com.amti.model.propietario.Propietario;
import com.amti.model.propietario.PropietarioRepository;
import com.amti.usecases.NegocioUseCase;
import com.amti.usecases.PropietarioUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfituration {



    @Bean
    public NegocioUseCase getNegocioUseCase(
            NegocioRepository repository){
        return new NegocioUseCase(repository);
    }

    @Bean
    public PropietarioUseCase getPropietarioUseCase(
            PropietarioRepository repository) {
        return new PropietarioUseCase(repository);
    }
}
