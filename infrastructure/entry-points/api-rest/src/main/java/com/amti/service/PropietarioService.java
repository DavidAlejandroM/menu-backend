package com.amti.service;

import com.amti.model.propietario.Propietario;
import com.amti.usecases.PropietarioUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class PropietarioService {

    @Autowired
    PropietarioUseCase propietarioUseCase;

    @GetMapping("/propietario")
    public Mono<Propietario> getAll(@RequestParam String correo){
        return propietarioUseCase.getPropietarioByCorreo(correo);
    }

    @PostMapping(value = "/propietario")
    public Mono<Propietario> create(@RequestBody Propietario propietario) {
        return propietarioUseCase.createPropietario(propietario);
    }
}
