package com.amti.model.categoria;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CategoriaRepository {

    Mono<Categoria> save(Categoria categoria);

    Flux<Categoria> findAllByNegocio(String negocioId);

    Flux<Categoria> findAllByEsPublica();
}
