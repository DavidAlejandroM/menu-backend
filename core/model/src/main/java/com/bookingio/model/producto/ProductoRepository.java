package com.bookingio.model.producto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductoRepository {
    Flux<Producto> findALLByNegocioId(String negocioId);
    Mono<Producto> save(Producto negocio);
}
