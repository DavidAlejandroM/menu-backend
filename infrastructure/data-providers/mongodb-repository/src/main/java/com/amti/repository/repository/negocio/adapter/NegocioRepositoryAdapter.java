package com.amti.repository.repository.negocio.adapter;

import com.amti.model.negocio.Negocio;
import com.amti.model.negocio.NegocioRepository;
import com.amti.repository.repository.negocio.NegocioData;
import com.amti.repository.repository.negocio.generic.GenericOperationRepository;

import com.amti.repository.repository.negocio.interfaces.NegocioDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NegocioRepositoryAdapter
        extends GenericOperationRepository<Negocio, NegocioData,String, NegocioDataRepository>
        implements NegocioRepository {


    @Autowired
    public NegocioRepositoryAdapter(NegocioDataRepository repository) {
        super(repository,NegocioData.class,Negocio.class);
    }
}
