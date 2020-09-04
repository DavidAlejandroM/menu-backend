package com.bookingio.repository.repository.interfaces;

import com.bookingio.repository.repository.CategoriaData;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CategoriaDataRepository extends ReactiveCrudRepository<CategoriaData,String>{

    Flux<CategoriaData> findAllByNegocioId(String negocioId);

    Flux<CategoriaData> findAllByEsPublica(Boolean esPublica);

    Flux<CategoriaData> findAllByNombre(String nombre);
}
