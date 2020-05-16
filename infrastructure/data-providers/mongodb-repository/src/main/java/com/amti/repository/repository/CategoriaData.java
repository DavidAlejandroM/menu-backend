package com.amti.repository.repository;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@Document
public class CategoriaData {
    @Id
    private String id;
    private String nombre;
    private String descripcion;
    private NegocioData negocio;
    private Boolean esPublica;
    private String image;
}
