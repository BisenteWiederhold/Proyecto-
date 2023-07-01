package org.example;
import org.junit.jupiter.api.Test;
import javax.swing.JFrame;
import static org.junit.jupiter.api.Assertions.*;

public class VentanaTest {

    @Test
    public void testCrearVentana() {
        Ventana ventana = new Ventana();

        // Verificar que la ventana se haya creado correctamente
        assertNotNull(ventana);

        // Verificar que el título de la ventana sea el esperado
        assertEquals("Ventana Principal", ventana.getTitle());

        // Verificar que el tamaño de la ventana sea el esperado
        assertEquals(800, ventana.getSize().width);
        assertEquals(600, ventana.getSize().height);

        // Verificar que la operación de cierre de la ventana esté configurada correctamente
        assertEquals(JFrame.EXIT_ON_CLOSE, ventana.getDefaultCloseOperation());

        // Verificar que la ventana sea visible
        assertTrue(ventana.isVisible());
    }

    private class Ventana extends JFrame {
        public Ventana() {
            setTitle("Ventana Principal");
            setSize(800, 600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
    }
}
