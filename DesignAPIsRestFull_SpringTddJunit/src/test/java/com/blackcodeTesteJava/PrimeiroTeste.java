package com.blackcodeTesteJava;

import java.util.stream.IntStream;
import org.assertj.core.api.Assertions;
//import org.junit.Assert;
//import org.junit.Test;

public class PrimeiroTeste {

    //@Test
    public void deveSomarDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        int num1 = 10, num2 = 14;
        int result = calculadora.somar(num1, num2);
        // Assertivas com AssertJ
        Assertions.assertThat(result).isEqualTo(24);
        // Asertivas com Junit
        //Assert.assertEquals( 24, result );
        //Assert.assertNotEquals(0, result);
        //Assert.assertNotNull(num1);
        //Assert.assertNotNull(num2);
        //Assert.assertNotNull(result);
       //Assert.assertNotNull(num2);
    }

    //@Test(expected = RuntimeException.class)
    public void naoDeveSomarNumerosNegativos(){
        Calculadora calculadora = new Calculadora();
        int num1 = -10, num2 = -11;
        calculadora.somar(num1, num2);
    }

}

class  Calculadora{
    int somar(int num1, int num2){
        if( num1 < 0 || num2 < 0){
            throw new RuntimeException("Não é permitido somar números negativos!");
        }
        return num1 + num2;
    }
}
