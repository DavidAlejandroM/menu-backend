package com.amti.repository.repository.adapter;

import com.amti.model.categoria.Categoria;
import com.amti.model.categoria.CategoriaRepository;
import com.amti.model.producto.Producto;
import com.amti.model.producto.ProductoRepository;
import com.amti.repository.repository.CategoriaData;
import com.amti.repository.repository.ProductoData;
import com.amti.repository.repository.generic.GenericOperationRepository;
import com.amti.repository.repository.interfaces.CategoriaDataRepository;
import com.amti.repository.repository.interfaces.ProductoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public class CategoriaRepositoryAdapter
        extends GenericOperationRepository<Categoria, CategoriaData, String, CategoriaDataRepository>
        implements CategoriaRepository {

    @Autowired
    public CategoriaRepositoryAdapter(CategoriaDataRepository repository) {
        super(repository, CategoriaData.class, Categoria.class);
    }

    @Override
    public Flux<Categoria> findAllByNegocio(String negocioId) {
        return repository.findAllByNegocioId(negocioId)
                .map(this::toEntity);
    }

    @Override
    public Flux<Categoria> findAllByEsPublica() {
        return repository.findAllByEsPublica(true)
                .map(this::toEntity);
    }
}
