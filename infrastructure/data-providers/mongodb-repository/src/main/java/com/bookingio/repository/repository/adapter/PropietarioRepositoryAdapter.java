package com.bookingio.repository.repository.adapter;

import com.bookingio.model.propietario.Propietario;
import com.bookingio.model.propietario.PropietarioRepository;
import com.bookingio.repository.repository.PropietarioData;
import com.bookingio.repository.repository.generic.GenericOperationRepository;
import com.bookingio.repository.repository.interfaces.PropietarioDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public class PropietarioRepositoryAdapter
        extends GenericOperationRepository<Propietario, PropietarioData,String, PropietarioDataRepository>
        implements PropietarioRepository {


    @Autowired
    public PropietarioRepositoryAdapter(PropietarioDataRepository repository) {
        super(repository,PropietarioData.class,Propietario.class);
    }

    @Override
    public Mono<Propietario> findByCorreo(String correo) {
        return Mono.just(repository.findByCorreo(correo)).block()
                .map(this::toEntity);
    }
}
