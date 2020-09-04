package com.bookingio.repository.repository.interfaces;

import com.bookingio.repository.repository.PropietarioData;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface PropietarioDataRepository extends ReactiveCrudRepository<PropietarioData,String>{

    Mono<PropietarioData> findByCorreo(String correo);
}
