package com.bookingio.model.negocio;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface NegocioRepository {
    Flux<Negocio> findAll();
    Mono<Negocio> save(Negocio negocio);
    Mono<Negocio> findById(String id);
}
