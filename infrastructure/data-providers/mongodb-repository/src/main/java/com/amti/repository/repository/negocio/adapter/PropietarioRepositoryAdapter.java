package com.amti.repository.repository.negocio.adapter;

import com.amti.model.negocio.Negocio;
import com.amti.model.negocio.NegocioRepository;
import com.amti.model.propietario.Propietario;
import com.amti.model.propietario.PropietarioRepository;
import com.amti.repository.repository.negocio.NegocioData;
import com.amti.repository.repository.negocio.PropietarioData;
import com.amti.repository.repository.negocio.generic.GenericOperationRepository;
import com.amti.repository.repository.negocio.interfaces.NegocioDataRepository;
import com.amti.repository.repository.negocio.interfaces.PropietarioDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
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
