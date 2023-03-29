package com.blackcodeTesteJava;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

//@RunWith(MockitoJUnitRunner.class)
public class MockitoTestes_2 {

    @Mock
    List<String> lista;

    @Test
    public void primeiroTestComMockitoModificado(){
        //Mockito.when(lista.size()).thenReturn(2);
        int size = lista.size();
        Assertions.assertThat( size ).isEqualTo(2);
        //Verifica se o metodo foi chamado
        Mockito.verify(lista, Mockito.times(1)).size();
    }

}
