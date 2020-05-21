package com.amti.repository.repository.interfaces;

import com.amti.repository.repository.PropietarioData;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface PropietarioDataRepository extends ReactiveCrudRepository<PropietarioData,String>{

    Mono<PropietarioData> findByCorreo(String correo);
}
