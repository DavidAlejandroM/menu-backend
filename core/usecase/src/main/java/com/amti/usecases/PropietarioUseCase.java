package com.amti.usecases;

import com.amti.model.propietario.Propietario;
import com.amti.model.propietario.PropietarioRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@AllArgsConstructor
public class PropietarioUseCase {

    private final PropietarioRepository propietarioRepository;

    public Mono<Propietario> getPropietarioByCorreo(String correo) {
        return propietarioRepository.findByCorreo(correo);
    }

    public Mono<Propietario> createPropietario(Propietario propietario) {
        Propietario propietarioDB = propietarioRepository.findByCorreo(propietario.getCorreo())
                .block();

        if(propietarioDB != null){
            return Mono.empty();
        }

        propietario.setFechaCreacion(LocalDateTime.now());
        propietario.setFechaModificacion(LocalDateTime.now());
        return  propietarioRepository.save(propietario);
    }
}
