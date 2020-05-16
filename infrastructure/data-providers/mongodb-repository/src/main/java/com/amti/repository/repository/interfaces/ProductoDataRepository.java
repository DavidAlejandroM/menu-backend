package com.amti.repository.repository.interfaces;

import com.amti.model.producto.Producto;
import com.amti.repository.repository.ProductoData;
import com.amti.repository.repository.PropietarioData;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductoDataRepository extends ReactiveCrudRepository<ProductoData,String>{

    public Flux<ProductoData> findAllByNegocio (String negocioId);
}
