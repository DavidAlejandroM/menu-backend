package com.bookingio.repository.repository.adapter;

import com.bookingio.model.producto.Producto;
import com.bookingio.model.producto.ProductoRepository;
import com.bookingio.repository.repository.ProductoData;
import com.bookingio.repository.repository.generic.GenericOperationRepository;
import com.bookingio.repository.repository.interfaces.ProductoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

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
