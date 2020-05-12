package com.amti.repository.repository.negocio;

import com.amti.model.Negocio;
import com.amti.repository.repository.negocio.adapter.NegocioRepositoryAdapter;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document
public class NegocioData extends NegocioRepositoryAdapter<NegocioData, Negocio> {

    @Id
    String id;
    String nit;
    String name;
    String dir;
}
