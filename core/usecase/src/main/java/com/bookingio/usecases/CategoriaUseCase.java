package com.bookingio.usecases;

import com.bookingio.model.categoria.Categoria;
import com.bookingio.model.categoria.CategoriaRepository;
import com.bookingio.model.negocio.Negocio;
import com.bookingio.model.negocio.NegocioRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class CategoriaUseCase {

    CategoriaRepository categoriaRepository;
    NegocioRepository negocioRepository;

    public Mono<Categoria> crear(Categoria categoria) {

        Negocio  negocio = negocioRepository.findById(categoria
                .getNegocio()
                .getId())
                .block();

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
