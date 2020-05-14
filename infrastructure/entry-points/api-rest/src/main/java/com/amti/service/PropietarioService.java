package com.amti.service;

import com.amti.model.negocio.Negocio;
import com.amti.model.propietario.Propietario;
import com.amti.usecases.NegocioUseCase;
import com.amti.usecases.PropietarioUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PropietarioService {

    @Autowired
    PropietarioUseCase propietarioUseCase;

    @GetMapping("/propietario")
    public Mono<Propietario> getAll(){
        return propietarioUseCase.getPropietarioByCorreo("jandro240@gmail.com");
    }

    @PostMapping(value = "/propietario")
    public Mono<Propietario> create(@RequestBody Propietario propietario) {
        return propietarioUseCase.createPropietario(propietario);
    }
}
