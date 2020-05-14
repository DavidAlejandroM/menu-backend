package com.amti.repository.repository.negocio;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document
public class NegocioData{

    @Id
    String id;
    String nit;
    String name;
    String dir;
}
