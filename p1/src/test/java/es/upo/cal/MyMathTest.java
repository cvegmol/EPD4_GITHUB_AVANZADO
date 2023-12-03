package es.upo.cal;


import org.testng.Assert;
import org.testng.annotations.Test;
public class MyMathTest {

    /**
     * Prueba la operación de suma.
     */
    @Test
    public void testSumar() {
        // Realiza la suma y compara el resultado con el valor esperado.
        Integer resultado = 5 + 10;
        Integer esperado = 15;
        Assert.assertEquals(resultado, esperado, "La suma no es correcta");
    }

    /**
     * Prueba la operación de resta.
     */
    @Test
    public void testRestar() {
        // Realiza la resta y compara el resultado con el valor esperado.
        Integer resultado = 15 - 7;
        Integer esperado = 8;
        Assert.assertEquals(resultado, esperado, "La resta no es correcta");
    }
}







