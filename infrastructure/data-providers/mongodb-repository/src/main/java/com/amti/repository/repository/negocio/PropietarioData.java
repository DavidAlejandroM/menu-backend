package com.amti.repository.repository.negocio;

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
public class PropietarioData {
    @Id
    private String id;
    private String numeroDocumento;
    private String tipoDocumento;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    private String telefono;
    private String celular;
    private List<NegocioData> negocios;
    @CreatedDate
    private LocalDateTime fechaCreacion;
    @LastModifiedDate
    private LocalDateTime fechaModificacion;

}
