package com.bookingio;

import com.bookingio.model.categoria.CategoriaRepository;
import com.bookingio.model.negocio.NegocioRepository;
import com.bookingio.model.producto.ProductoRepository;
import com.bookingio.model.propietario.PropietarioRepository;
import com.bookingio.usecases.CategoriaUseCase;
import com.bookingio.usecases.NegocioUseCase;
import com.bookingio.usecases.ProductoUseCase;
import com.bookingio.usecases.PropietarioUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {


    @Bean
    public NegocioUseCase getNegocioUseCase(
            NegocioRepository repository,
            PropietarioRepository propietarioRepository) {
        return new NegocioUseCase(repository, propietarioRepository);
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
