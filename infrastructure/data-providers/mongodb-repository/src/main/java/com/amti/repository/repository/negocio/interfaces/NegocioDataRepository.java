package com.amti.repository.repository.negocio.interfaces;

import com.amti.repository.repository.negocio.NegocioData;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface NegocioDataRepository extends ReactiveCrudRepository<NegocioData,String>{
}
