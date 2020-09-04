package com.bookingio.repository.repository.interfaces;

import com.bookingio.repository.repository.ProductoData;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ProductoDataRepository extends ReactiveCrudRepository<ProductoData,String>{

    public Flux<ProductoData> findAllByNegocio (String negocioId);
}
