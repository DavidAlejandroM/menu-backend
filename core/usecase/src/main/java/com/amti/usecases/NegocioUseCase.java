package com.amti.usecases;

import com.amti.model.negocio.Negocio;
import com.amti.model.negocio.NegocioRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class NegocioUseCase {
    private final NegocioRepository repository;

    public Flux<Negocio> findAll(){
        return repository.findAll();
    }

    public Mono<Negocio> create(Negocio negocio) {
        return repository.save(negocio);
    }
}
