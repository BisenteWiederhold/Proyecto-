package org.example;

public class PersonalEmpresa {
    private int costo;
    private String comprobante;
    public PersonalEmpresa(SistemaDeReserva sist, String Origen, String Destino, String dia, int HoraSalida, String TipoBus, int asiento ){
        Boleto boleto = sist.elegirBoleto(Origen,Destino,dia,HoraSalida);
        Bus bus = sist.elegirBusAsiento(TipoBus,asiento);
        String s = sist.getCom();
        this.comprobante = s;
        this.costo = sist.ConfirmarPago();
    }
    public int CuantoPague(){
        return costo;
    }
    public String VerComprobante(){
        return comprobante;
    }
}
