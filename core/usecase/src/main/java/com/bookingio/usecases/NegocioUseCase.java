package com.bookingio.usecases;

import com.bookingio.model.negocio.Negocio;
import com.bookingio.model.negocio.NegocioRepository;
import com.bookingio.model.propietario.Propietario;
import com.bookingio.model.propietario.PropietarioRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class NegocioUseCase {
    private final NegocioRepository repository;
    private final PropietarioRepository propietarioRepository;

    public Flux<Negocio> findAll(){
        return repository.findAll();
    }

    public Mono<Negocio> create(Negocio negocio) {
        return repository.save(negocio);
    }

    public Flux<Negocio> findAllByCorreoPropietario(String correo) {
        return propietarioRepository.findByCorreo(correo)
                .map(Propietario::getNegocios)
                .flatMapMany(Flux::fromIterable);
    }
}
