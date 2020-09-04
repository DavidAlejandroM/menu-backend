package com.bookingio.model.propietario;

import reactor.core.publisher.Mono;

public interface PropietarioRepository {
    Mono<Propietario> findByCorreo(String correo);
    Mono<Propietario> save(Propietario propietario);
}
