package com.amti.repository.repository.negocio.adapter;

import com.amti.model.Negocio;
import com.amti.repository.repository.negocio.NegocioData;
import com.amti.repository.repository.negocio.generic.GenericOperationRepository;
import com.amti.repository.repository.negocio.interfaces.NegocioDataRepository;
import org.modelmapper.ModelMapper;

import java.lang.reflect.Type;

public class NegocioRepositoryAdapter
        extends GenericOperationRepository<Negocio, NegocioData,String, NegocioDataRepository>
        implements NegocioDataRepository {

    }
}
