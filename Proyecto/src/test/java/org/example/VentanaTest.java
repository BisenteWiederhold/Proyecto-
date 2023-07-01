package org.example;
import org.junit.jupiter.api.Test;
import javax.swing.JFrame;
import static org.junit.jupiter.api.Assertions.*;

public class VentanaTest {

    @Test
    public void testCrearVentana() {
        Ventana ventana = new Ventana();

        assertNotNull(ventana);

        assertEquals("Ventana Principal", ventana.getTitle());

        assertEquals(800, ventana.getSize().width);
        assertEquals(600, ventana.getSize().height);

        assertEquals(JFrame.EXIT_ON_CLOSE, ventana.getDefaultCloseOperation());

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
