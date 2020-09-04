package com.bookingio.repository.repository.adapter;

import com.bookingio.model.negocio.Negocio;
import com.bookingio.model.negocio.NegocioRepository;
import com.bookingio.repository.repository.NegocioData;
import com.bookingio.repository.repository.generic.GenericOperationRepository;
import com.bookingio.repository.repository.interfaces.NegocioDataRepository;
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
