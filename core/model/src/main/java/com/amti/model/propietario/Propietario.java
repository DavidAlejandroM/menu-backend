package com.amti.model.propietario;

import com.amti.model.negocio.Negocio;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Propietario {
    private String id;
    private String numeroDocumento;
    private String tipoDocumento;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private String telefono;
    private String celular;
    private List<Negocio> negocios;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaModificacion;
}
