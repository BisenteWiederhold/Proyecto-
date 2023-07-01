package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BusTest {
    @Test
    @DisplayName("getTipo de un bus normal")
    public void testGetTipo() {
        Normal normal = new Normal();
        String tipo = normal.getTipo();
        assertEquals("Normal", tipo);
    }

    @Test
    @DisplayName("getPrecio de bus normal")
    public void testGetPrecio() {
        Normal normal = new Normal();
        int precio = normal.getPrecio();
        assertEquals(14000, precio);
    }

    @Test
    @DisplayName("getTipo de salon cama")
    public void testGetTipo2() {
        SalonCama salonCama = new SalonCama();
        String tipo = salonCama.getTipo();
        assertEquals("SalonCama", tipo);
    }

    @Test
    @DisplayName("getPrecio de salon cama")
    public void testGetPrecio2() {
        SalonCama salonCama = new SalonCama();
        int precio = salonCama.getPrecio();
        assertEquals(18000, precio);
    }

    @Test
    @DisplayName("Reconoce los asientos que si pueden ser reservados")
    public void testGetAsientoValido() {
        Normal normal = new Normal();
        Integer resultado = normal.getasiento(1);
        assertNotNull(resultado);
        assertEquals(1, resultado.intValue());
    }
}