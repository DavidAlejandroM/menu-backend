package com.amti.usecases;

import com.amti.model.propietario.Propietario;
import com.amti.model.propietario.PropietarioRepository;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import reactor.core.publisher.Mono;

import static org.mockito.Mockito.*;

class PropietarioUseCaseTest {


    @Mock
    PropietarioRepository propietarioRepository;

    PropietarioUseCase propietarioUseCase;
    Propietario propietario;

    @BeforeEach
    public void initMocks() {
        propietarioRepository = mock(PropietarioRepository.class);
        propietarioUseCase = new PropietarioUseCase(propietarioRepository);
        propietario = Propietario.builder()
                .correo("jandro240@gmail.com")
                .nombre("nombre").build();
    }


    @Test
    void getPropietarioByCorreo() {

        when(propietarioRepository
                .findByCorreo(anyString()))
                .thenReturn(null);
        Assert.assertEquals(propietarioUseCase.getPropietarioByCorreo(anyString()),
                null);
    }

    @Test
    void getPropietarioByCorreoReturnPropietario() {

        when(propietarioRepository
                .findByCorreo(anyString()))
                .thenReturn(Mono.just(propietario));
        Assert.assertEquals(propietarioUseCase.getPropietarioByCorreo(anyString()).block(),
                propietario);

    }

    @Test
    void createPropietario() {
        when(propietarioRepository
                .findByCorreo(anyString()))
                .thenReturn(Mono.just(propietario));

        Assert.assertEquals(propietarioUseCase.createPropietario(propietario),
                Mono.empty());
    }

    @Test
    void createPropietarioWhenNoFounPropietario() {

        when(propietarioRepository
                .findByCorreo(anyString()))
                .thenReturn(Mono.empty());

        when(propietarioRepository.save(any())).thenReturn(Mono.just(propietario));

        Assert.assertEquals(propietarioUseCase.createPropietario(propietario).block(),
                propietario);
    }
}