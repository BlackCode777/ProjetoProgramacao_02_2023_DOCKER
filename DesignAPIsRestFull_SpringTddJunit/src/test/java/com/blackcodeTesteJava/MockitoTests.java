package com.blackcodeTesteJava;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class MockitoTests {

    @Test
    public void primeiroTesteComMockito(){
        List<String> lista = Mockito.mock(ArrayList.class);
        Mockito.when( lista.size() ).thenReturn(1);
        int size = lista.size();
        Assertions.assertThat(size).isEqualTo(1);
    }

}
