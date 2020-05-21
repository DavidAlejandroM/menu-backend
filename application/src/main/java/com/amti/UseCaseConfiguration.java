package com.amti;

import com.amti.model.categoria.CategoriaRepository;
import com.amti.model.negocio.NegocioRepository;
import com.amti.model.producto.ProductoRepository;
import com.amti.model.propietario.PropietarioRepository;
import com.amti.usecases.CategoriaUseCase;
import com.amti.usecases.NegocioUseCase;
import com.amti.usecases.ProductoUseCase;
import com.amti.usecases.PropietarioUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {


    @Bean
    public NegocioUseCase getNegocioUseCase(
            NegocioRepository repository) {
        return new NegocioUseCase(repository);
    }

    @Bean
    public PropietarioUseCase getPropietarioUseCase(
            PropietarioRepository repository) {
        return new PropietarioUseCase(repository);
    }

    @Bean
    public ProductoUseCase getProductoUseCase(
            ProductoRepository productoRepository, NegocioRepository negocioRepository) {
        return new ProductoUseCase(productoRepository, negocioRepository);
    }

    @Bean
    public CategoriaUseCase getCategoriaUseCase(CategoriaRepository categoriaRepository,
                                                NegocioRepository negocioRepository) {
        return new CategoriaUseCase(categoriaRepository, negocioRepository);
    }
}
