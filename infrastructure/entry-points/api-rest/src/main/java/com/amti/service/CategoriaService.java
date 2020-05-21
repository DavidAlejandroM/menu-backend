package com.amti.service;

import com.amti.model.categoria.Categoria;
import com.amti.usecases.CategoriaUseCase;
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

    @GetMapping("/holasofi")
    public Mono<String> holaSofi(){
        return Mono.just("HOLA SOFIIIII, COMO VAS?");
    }
}
