package es.upo.cal;

import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.ansi;

/**
 * Clase principal de la aplicación.
 */
public class App {

    /**
     * Método principal que inicia la aplicación.
     *
     * @param args Los argumentos de la línea de comandos.
     * @throws Exception Se lanza si hay algún error durante la ejecución.
     */
    public static void main(String[] args) throws Exception {
        // Instala el sistema de consola ANSI.
        AnsiConsole.systemInstall();

        // Imprime un prompt estilizado y un saludo.
        System.out.print(ansi().bold().fgBrightRed().a(">").fgBrightYellow().a(">").fgBrightGreen().a(">").reset().a(" "));
        System.out.println("Hello World!");
    }
}
