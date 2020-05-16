package com.amti.usecases;

import com.amti.model.categoria.Categoria;
import com.amti.model.categoria.CategoriaRepository;
import com.amti.model.negocio.Negocio;
import com.amti.model.negocio.NegocioRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class CategoriaUseCase {

    CategoriaRepository categoriaRepository;
    NegocioRepository negocioRepository;

    public Mono<Categoria> crear(Categoria categoria) {

        Negocio  negocio = negocioRepository.findById(categoria.getNegocio().getId()).block();

        categoria.setNegocio(negocio);

        return categoriaRepository.save(categoria);
    }

    public Flux<Categoria> obtenerCategoriasPorNegocio(String negocioId) {
        return categoriaRepository.findAllByNegocio(negocioId);
    }

    public Flux<Categoria> getPublicsCategories() {
        return categoriaRepository.findAllByEsPublica();
    }
}
