package com.bookingio.model.categoria;

import com.bookingio.model.negocio.Negocio;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Categoria {
    private String id;
    private String nombre;
    private String descripcion;
    private Negocio negocio;
    private Boolean esPublica;
    private String image;
}
