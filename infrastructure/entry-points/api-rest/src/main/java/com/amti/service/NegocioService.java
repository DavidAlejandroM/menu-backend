package com.amti.service;

import com.amti.model.Negocio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class NegocioService {

    @GetMapping("/negocio/")
    public Flux<Negocio> getAll(){
        return Flux.empty();
    }
}
