package com.amti.service;

import com.amti.model.negocio.Negocio;
import com.amti.usecases.NegocioUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class NegocioService {

    @Autowired
    NegocioUseCase negocioUseCase;

    @GetMapping("/negocio/")
    public Flux<Negocio> getAll(){
        return negocioUseCase.findAll();
    }

    @PostMapping("/negocio/")
    public Mono<Negocio> create(@RequestBody Negocio negocio) {
        return negocioUseCase.create(negocio);
    }
}
