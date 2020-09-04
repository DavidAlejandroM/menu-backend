package com.bookingio.repository.repository.interfaces;

import com.bookingio.repository.repository.NegocioData;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface NegocioDataRepository extends ReactiveCrudRepository<NegocioData,String>{
}
