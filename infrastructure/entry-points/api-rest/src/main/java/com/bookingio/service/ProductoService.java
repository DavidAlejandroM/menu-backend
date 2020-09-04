package com.bookingio.service;

import com.bookingio.model.producto.Producto;
import com.bookingio.usecases.ProductoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProductoService {

    @Autowired
    ProductoUseCase productoUseCase;

    @GetMapping("/producto/negocio")
    public Flux<Producto> getAll(@RequestParam String idNegocio){
        return productoUseCase.obtenerProductosPorNegocio(idNegocio);
    }

    @PostMapping(value = "/producto")
    public Mono<Producto> create(@RequestBody Producto producto) {
        return productoUseCase.crearNuevoProducto(producto);
    }
}
