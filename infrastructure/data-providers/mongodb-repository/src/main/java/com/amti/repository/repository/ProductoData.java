package com.amti.repository.repository;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document
public class ProductoData {
    @Id
    private String id;
    private String nombre;
    private String descripcion;
    private String precio;
    private String negocio;
}
