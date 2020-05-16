package com.amti.usecases;

import com.amti.model.negocio.NegocioRepository;
import com.amti.model.producto.Producto;
import com.amti.model.producto.ProductoRepository;
import com.amti.model.propietario.Propietario;
import com.amti.model.propietario.PropietarioRepository;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

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
