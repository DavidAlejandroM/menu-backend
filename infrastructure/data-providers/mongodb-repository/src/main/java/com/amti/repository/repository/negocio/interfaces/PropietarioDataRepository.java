package com.amti.repository.repository.negocio.interfaces;

import com.amti.model.propietario.Propietario;
import com.amti.repository.repository.negocio.NegocioData;
import com.amti.repository.repository.negocio.PropietarioData;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface PropietarioDataRepository extends ReactiveCrudRepository<PropietarioData,String>{

    Mono<PropietarioData> findByCorreo(String correo);
}
