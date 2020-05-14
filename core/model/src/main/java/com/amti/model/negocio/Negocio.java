package com.amti.model.negocio;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Negocio {
    private String id;
    private String nit;
    private String name;
    private String dir;
}
