package com.amti.repository.repository.generic;

import org.modelmapper.ModelMapper;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.lang.reflect.Type;

public abstract class GenericOperationRepository<S, D, I, R extends ReactiveCrudRepository<D, I>> {

    protected R repository;
    protected ModelMapper modelMapper;
    private Class<D> dataClass;
    private Class<S> entityClass;

    public GenericOperationRepository(R repository, Class<D> dataClass, Class<S> entityClass) {
        this.repository = repository;
        this.dataClass = dataClass;
        this.entityClass = entityClass;
    }

    public Mono<S> save(S entity) {
        return Mono.just(entity)
                .map(this::toData)
                .flatMap(this::saveData)
                .map(this::toEntity);
    }

    public Mono<S> findById(I id) {
        return repository.findById(id)
                .map(this::toEntity);
    }

    public Flux<S> findAll() {
        return repository.findAll()
                .map(this::toEntity);
    }

    public S toEntity(D data) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(data, (Type) entityClass);
    }

    public D toData(S entity) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(entity, dataClass);
    }


    protected Mono<D> saveData(D data) {
        return repository.save(data);
    }

}
