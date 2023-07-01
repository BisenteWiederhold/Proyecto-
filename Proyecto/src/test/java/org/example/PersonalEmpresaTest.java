package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonalEmpresaTest {
    private SistemaDeReserva sist;
    private PersonalEmpresa p;
    @BeforeEach
    public void setUp(){
        sist = new SistemaDeReserva();
    }
    @Test
    @DisplayName("Se sabe cuanto se pago")
    public void TestCuantoSePago()throws Exception{
        p = new PersonalEmpresa(sist,"Valdivia","Puerto Montt","Lunes",12,"SalonCama",14);
        assertEquals(18000,p.CuantoPague());

        p = new PersonalEmpresa(sist,"Concepcion","Santiago","Miercoles",7,"Normal",3);
        assertEquals(14000,p.CuantoPague());

        p = new PersonalEmpresa(sist,"Valparaiso","Concepcion","Viernes",18,"Normal",1);
        assertEquals(14000,p.CuantoPague());

        p = new PersonalEmpresa(sist,"Puerto Montt","Valparaiso","Lunes",7,"SalonCama",9);
        assertEquals(18000,p.CuantoPague());
    }
    @Test
    @DisplayName("Test cuando elgen el mismo origen y destoino")
    public void TestParaElegirOrigenYDestino(){
        Exception exception = assertThrows(SeRepitenLugaresException.class,()->{
            p = new PersonalEmpresa(sist,"Concepcion","Concepcion","Viernes",18,"Normal",2);
        });
    }
    @Test
    @DisplayName("Que el comprobante no sea nulo y sea correcto")
    public void TestParaComprobante()throws Exception{
        p = new PersonalEmpresa(sist,"Puerto Montt","Valparaiso","Viernes",7,"SalonCama",9);
        assertNotNull(p.VerComprobante());
    }
}