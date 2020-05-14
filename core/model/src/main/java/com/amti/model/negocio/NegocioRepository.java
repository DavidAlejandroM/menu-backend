package com.amti.model.negocio;

import com.amti.model.negocio.Negocio;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface NegocioRepository {
    Flux<Negocio> findAll();
    Mono<Negocio> save(Negocio negocio);
}
