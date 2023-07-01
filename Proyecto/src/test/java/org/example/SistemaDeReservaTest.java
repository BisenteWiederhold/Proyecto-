package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SistemaDeReservaTest {
    private SistemaDeReserva s;
    @BeforeEach
    public void setUp(){
        s = new SistemaDeReserva();
    }
    @Test
    @DisplayName("Comprar un boleto correctamente")
    public void ComprarBoleto()throws Exception{
        Boleto b = s.elegirBoleto("Valparaiso","Valdivia","Lunes",16);
        assertNotNull(b);
        assertNotNull(b.getLlegada());
        assertNotNull(b.getSalida());
        assertNotNull(b.getDia());
        assertNotNull(b.getOrigen());
        assertNotNull(b.getDestino());
    }
    @Test
    @DisplayName("Elige correctamente Bus y asiento")
    public void ElegirAsientoYBus()throws Exception{
        Bus a = s.elegirBusAsiento("Normal",4);
        assertNotNull(a);
        assertNotNull(a.getPrecio());
        assertNotNull(a.getasiento(4));
        assertNotNull(a.getTipo());
        assertEquals("Normal",a.getTipo());
    }
    @Test
    @DisplayName("Cobra bien el precio del ticket del bus")
    public void Cobrar()throws Exception{
        Bus a = s.elegirBusAsiento("Normal",6);
        assertEquals(14000,a.getPrecio());
        assertEquals(14000,s.ConfirmarPago());
    }
    @Test
    @DisplayName("Entrega comprobante")
    public void getComprobante()throws Exception{
        Boleto b = s.elegirBoleto("Valparaiso","Santiago","Miercoles",12);
        Bus a = s.elegirBusAsiento("Normal",16);
        int c = s.ConfirmarPago();
        assertNotNull(s.getCom());
    }
}