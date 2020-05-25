package com.amti.usecases;

import com.amti.model.negocio.Negocio;
import com.amti.model.negocio.NegocioRepository;
import com.amti.model.propietario.Propietario;
import com.amti.model.propietario.PropietarioRepository;
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
