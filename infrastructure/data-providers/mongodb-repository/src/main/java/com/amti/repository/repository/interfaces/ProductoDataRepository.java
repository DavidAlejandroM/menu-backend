package com.amti.repository.repository.interfaces;

import com.amti.repository.repository.ProductoData;
import com.amti.repository.repository.PropietarioData;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface ProductoDataRepository extends ReactiveCrudRepository<ProductoData,String>{

}
