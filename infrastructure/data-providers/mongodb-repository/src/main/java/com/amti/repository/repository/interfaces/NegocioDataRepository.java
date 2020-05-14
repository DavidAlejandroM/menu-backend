package com.amti.repository.repository.interfaces;

import com.amti.repository.repository.NegocioData;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface NegocioDataRepository extends ReactiveCrudRepository<NegocioData,String>{
}
