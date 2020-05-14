package com.amti.model.producto;

import com.amti.model.negocio.Negocio;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductoRepository {
    Flux<Producto> findALLByNegocioId(String negocioId);
    Mono<Producto> save(Producto negocio);
}
