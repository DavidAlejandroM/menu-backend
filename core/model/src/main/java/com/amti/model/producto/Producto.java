package com.amti.model.producto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Producto {
    private String id;
    private String nombre;
    private String descripcion;
    private Integer precio;
    private String moneda;
    private String negocio;
}
