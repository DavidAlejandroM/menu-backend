package com.bookingio.repository.repository.adapter;

import com.bookingio.model.categoria.Categoria;
import com.bookingio.model.categoria.CategoriaRepository;
import com.bookingio.repository.repository.CategoriaData;
import com.bookingio.repository.repository.generic.GenericOperationRepository;
import com.bookingio.repository.repository.interfaces.CategoriaDataRepository;
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
                .map(this::toEntity).sort((a,b)->a.getNombre().compareTo(b.getNombre()));
    }
}
