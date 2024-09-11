package listas.lista01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {

    @Test
    public void testCalcularArea() {
        Triangulo triangulo = new Triangulo(5, 5, 5, 4);
        assertEquals(10, triangulo.calcularArea());
    }

    @Test
    public void testObterTipoEquilatero() {
        Triangulo triangulo = new Triangulo(5, 5, 5, 4);
        assertEquals("Equilátero", triangulo.obterTipo());
    }
}
