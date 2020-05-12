package com.amti.repository.repository.negocio.generic;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

import java.lang.reflect.Type;

public abstract class GenericOperationRepository<E,D,I,R extends ReactiveCrudRepository<D, I>> {

    protected R repository;

    public Mono<E> save(E entity){
        return Mono.just(entity)
                .map(this::toData)
                .flatMap(this::saveData)
                .map(this::toEntity);
    }

    public E toEntity(D data) {
        ModelMapper modelMapper = new ModelMapper();
        E entity = null;
        return  modelMapper.map(entity, (Type) data.getClass());
    }

    public D toData(E entity) {
        ModelMapper modelMapper = new ModelMapper();
        D data = null;
        return  modelMapper.map(data, (Type) entity.getClass());
    }


    protected Mono<D> saveData(D data) {
        return repository.save(data);
    }
}
