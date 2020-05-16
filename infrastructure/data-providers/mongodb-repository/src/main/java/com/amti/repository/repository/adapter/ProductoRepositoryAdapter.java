package com.amti.repository.repository.adapter;

import com.amti.model.producto.Producto;
import com.amti.model.producto.ProductoRepository;
import com.amti.repository.repository.ProductoData;
import com.amti.repository.repository.generic.GenericOperationRepository;
import com.amti.repository.repository.interfaces.ProductoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class ProductoRepositoryAdapter
        extends GenericOperationRepository<Producto, ProductoData, String, ProductoDataRepository>
        implements ProductoRepository {

    @Autowired
    public ProductoRepositoryAdapter(ProductoDataRepository repository) {
        super(repository, ProductoData.class, Producto.class);
    }

    @Override
    public Flux<Producto> findALLByNegocioId(String negocioId) {

        return repository.findAllByNegocio(negocioId)
                .map(this::toEntity);
    }
}
