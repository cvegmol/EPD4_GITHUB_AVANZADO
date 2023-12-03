package es.upo.cal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Clase de prueba para la clase principal de la aplicación (App).
 */
@ExtendWith(OutputCaptureExtension.class)
public class AppTest {

    /**
     * Prueba el método main de la aplicación.
     *
     * @param capture Captura la salida estándar durante la ejecución del método main.
     * @throws Exception Se lanza si hay algún error durante la ejecución.
     */
    @Test
    void testHello(CapturedOutput capture) throws Exception {
        // Ejecuta el método main de la aplicación con argumentos vacíos.
        App.main(new String[]{});

        // Comprueba que la salida coincida con la cadena esperada.
        assertThat(capture.toString()).isEqualToIgnoringNewLines(">>> Hello World!");
    }
}