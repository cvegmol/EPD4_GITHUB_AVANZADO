package es.upo.cal;


import org.testng.Assert;
import org.testng.annotations.Test;
public class MyMathTest {
    @Test
    public void testSumar() {
        Integer resultado = 5 + 10;
        Integer esperado = 15;
        Assert.assertEquals(resultado, esperado, "La suma no es correcta");
    }

    @Test
    public void testRestar() {
        Integer resultado = 15 - 7;
        Integer esperado = 8;
        Assert.assertEquals(resultado, esperado, "La resta no es correcta");
    }
}







