package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/*
 * Hemos creado p1 que es un perro y g1 que es un gato
 * Hemos generado los sonidos de Perro y gato
 * */
public class App {

    @Test
    void testSonidoPerro() {
        // Arrange
        Perro p1 = new Perro("Perro1");

        // Act
        String sonidoPerro = p1.sonido();

        // Assert
        assertEquals("Woof", sonidoPerro, "El sonido del perro debe ser 'Woof'");
    }

    @Test
    void testSonidoGato() {
        // Arrange
        Gato g1 = new Gato("Gato1");

        // Act
        String sonidoGato = g1.sonido();

        // Assert
        assertEquals("Miau", sonidoGato, "El sonido del gato debe ser 'Miau'");
    }

}
