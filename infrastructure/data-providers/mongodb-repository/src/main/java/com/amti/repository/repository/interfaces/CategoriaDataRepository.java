package com.amti.repository.repository.interfaces;

import com.amti.repository.repository.CategoriaData;
import com.amti.repository.repository.ProductoData;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CategoriaDataRepository extends ReactiveCrudRepository<CategoriaData,String>{

    Flux<CategoriaData> findAllByNegocioId(String negocioId);

    Flux<CategoriaData> findAllByEsPublica(Boolean esPublica);
}
