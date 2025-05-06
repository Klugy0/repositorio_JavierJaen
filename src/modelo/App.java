package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import modelo.Perro;
import modelo.Gato;

public class App {

    @Test
    void testSonidoPerro() {
        Perro p1 = new Perro("Perro1");
        String sonidoPerro = p1.sonido();
        assertEquals("Woof", sonidoPerro, "El sonido del perro debe ser 'Woof'");
    }

    @Test
    void testSonidoGato() {
        Gato g1 = new Gato("Gato1");
        String sonidoGato = g1.sonido();
        assertEquals("Miau", sonidoGato, "El sonido del gato debe ser 'Miau'");
    }

}