package com.bookingio.service;

import com.bookingio.model.categoria.Categoria;
import com.bookingio.usecases.CategoriaUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CategoriaService {

    @Autowired
    CategoriaUseCase categoriaUseCase;

    @GetMapping("/categoria/negocio")
    public Flux<Categoria> getAll(@RequestParam String idNegocio){
        return categoriaUseCase.obtenerCategoriasPorNegocio(idNegocio);
    }

    @GetMapping("/categoria/public")
    public Flux<Categoria> getAllPublic(){
        return categoriaUseCase.getPublicsCategories();
    }

    @PostMapping(value = "/categoria")
    public Mono<Categoria> create(@RequestBody Categoria categoria) {
        return categoriaUseCase.crear(categoria);
    }

}
