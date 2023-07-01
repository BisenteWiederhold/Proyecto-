package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BoletoTest {
    private Boleto b;
    @BeforeEach
    public void setUp(){
        b = new Boleto("Concepcion","Santiago","Lunes",7,13);
    }
    @Test
    @DisplayName("Test getDestino")
    public void TestGetDestino() throws Exception{
        assertEquals("Santiago",b.getDestino());
    }
    @Test
    @DisplayName("Test getOrigenestino")
    public void TestGetOrigen() throws Exception{
        assertEquals("Concepcion",b.getOrigen());
    }
    @Test
    @DisplayName("Test getDia")
    public void TestGetDia() throws Exception{
        assertEquals("Lunes",b.getDia());
    }
    @Test
    @DisplayName("Test getSalida")
    public void TestGetSalida() throws Exception{
        assertEquals(7,b.getSalida());
    }
    @Test
    @DisplayName("Test getDestino")
    public void TestGetLlegada() throws Exception{
        assertEquals(13,b.getLlegada());
    }
}