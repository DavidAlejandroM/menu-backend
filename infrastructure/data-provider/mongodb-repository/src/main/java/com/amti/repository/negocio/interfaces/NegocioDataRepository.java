package com.amti.repository.negocio.interfaces;

import com.amti.repository.negocio.NegocioData;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface NegocioDataRepository extends ReactiveCrudRepository<NegocioData,String>,
        ReactiveQueryByExampleExecutor<NegocioData> {
}
