package com.bookingio.usecases;

import com.bookingio.model.negocio.NegocioRepository;
import com.bookingio.model.producto.Producto;
import com.bookingio.model.producto.ProductoRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ProductoUseCase {

    private final ProductoRepository productoRepository;
    private final NegocioRepository negocioRepository;

    public Mono<Producto> crearNuevoProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public Flux<Producto> obtenerProductosPorNegocio(String negocio) {
        return productoRepository.findALLByNegocioId(negocio);
    }

}
