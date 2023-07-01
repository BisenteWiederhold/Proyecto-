package org.example;

public class SistemaDeReserva {
    private String BoletoOrigen, BoletoDestino, BoletoDia;
    private int BoletoSalida, BoletoLLegada;
    public static final String ubi1 = "Puerto Montt";
    public static final String ubi2 = "Valdivia";
    public static final String ubi3 = "Concepcion";
    public static final String ubi4 = "Santiago";
    public static final String ubi5 = "Valparaiso";
    public String dia1 = "Lunes", dia2 = "Miercoles", dia3 = "Viernes";
    private int hr1, hr2, hr3;
    private int pago;
    private Normal bus1;
    private SalonCama bus2;
    private String b;
    private int asiento;
    public SistemaDeReserva(){
        this.BoletoOrigen = "";
        this.BoletoDestino = "";
        this.BoletoDia = "";
        this.BoletoSalida = 0;
        this.BoletoLLegada = 0;
        this.pago = 0;
        this.hr1 = 7;
        this.hr2 = 12;
        this.hr3 = 18;
        this.asiento=0;
        this.b = "";
        this.bus1 = new Normal();
        this.bus2 = new SalonCama();
    }
    public Boleto elegirBoleto(String a, String b, String c, int d){
        if(a == b){
            return null ;
        }else{
            BoletoOrigen = a;
            BoletoDestino = b;
            BoletoDia = c;
            BoletoSalida = d;
            if(d == hr1){
                switch (BoletoOrigen) {
                    case "Puerto Montt":
                        if (BoletoDestino == "Valdivia"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 3;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            pago = 4000+pago;
                            BoletoLLegada = d + 8;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            pago = 4000+pago;
                            BoletoLLegada = d + 13;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            pago = 4000+pago;
                            BoletoLLegada = d + 14;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Valdivia":
                        if (BoletoDestino == "Puerto Montt"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 3;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            pago = 4000+pago;
                            BoletoLLegada = d + 10;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            pago = 4000+pago;
                            BoletoLLegada = d + 11;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Concepcion":
                        if (BoletoDestino == "Puerto Montt"){
                            pago = 4000+pago;
                            BoletoLLegada = d + 8;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 6;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Santiago":
                        if (BoletoDestino == "Puerto Montt"){
                            pago = 4000+pago;
                            BoletoLLegada = d + 13;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            pago = 4000+pago;
                            BoletoLLegada = d + 10;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 1;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Valparaiso":
                        if (BoletoDestino == "Puerto Montt"){
                            pago = 4000+pago;
                            BoletoLLegada = d + 14;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            pago = 4000+pago;
                            BoletoLLegada = d + 11;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 6;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 1;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    default:
                }
            }else if(d == hr2){
                switch (BoletoOrigen) {
                    case "Puerto Montt":
                        if (BoletoDestino == "Valdivia"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 3;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            pago = 4000+pago;
                            BoletoLLegada = d + 8;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            pago = 4000+pago;
                            BoletoLLegada = 1;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            pago = 4000+pago;
                            BoletoLLegada = 2;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Valdivia":
                        if (BoletoDestino == "Puerto Montt"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 3;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            pago = 4000+pago;
                            BoletoLLegada = d + 10;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            pago = 4000+pago;
                            BoletoLLegada = d + 11;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Concepcion":
                        if (BoletoDestino == "Puerto Montt"){
                            pago = 4000+pago;
                            BoletoLLegada = d + 8;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 6;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Santiago":
                        if (BoletoDestino == "Puerto Montt"){
                            pago = 4000+pago;
                            BoletoLLegada = 1;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            pago = 4000+pago;
                            BoletoLLegada = d + 10;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 1;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Valparaiso":
                        if (BoletoDestino == "Puerto Montt"){
                            pago = 4000+pago;
                            BoletoLLegada = 2;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            pago = 4000+pago;
                            BoletoLLegada = d + 11;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 6;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 1;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    default:
                }
            }else if(d == hr3){
                switch (BoletoOrigen) {
                    case "Puerto Montt":
                        if (BoletoDestino == "Valdivia"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 3;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            pago = 4000+pago;
                            BoletoLLegada = 2;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            pago = 4000+pago;
                            BoletoLLegada = 7;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            pago = 4000+pago;
                            BoletoLLegada = 8;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Valdivia":
                        if (BoletoDestino == "Puerto Montt"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 3;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            pago = 4000+pago;
                            BoletoLLegada = 4;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            pago = 4000+pago;
                            BoletoLLegada = 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Concepcion":
                        if (BoletoDestino == "Puerto Montt"){
                            pago = 4000+pago;
                            BoletoLLegada = 2;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 6;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Santiago":
                        if (BoletoDestino == "Puerto Montt"){
                            pago = 4000+pago;
                            BoletoLLegada = 7;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            pago = 4000+pago;
                            BoletoLLegada = 4;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 1;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Valparaiso":
                        if (BoletoDestino == "Puerto Montt"){
                            pago = 4000+pago;
                            BoletoLLegada = 7;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            pago = 4000+pago;
                            BoletoLLegada = 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 6;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            pago = 2000+pago;
                            BoletoLLegada = d + 1;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    default:
                }
            }
        }
        return null;
    }
    public Bus elegirBusAsiento(String s, int y){
        b = s;
        asiento = y;
        if(b == bus1.getTipo()){
            Normal b1 = bus1;
            b1.llenarBus(asiento);
            pago = pago + b1.getPrecio();
            return b1;
        }else if(b == bus2.getTipo()){
            SalonCama b2 = bus2;
            b2.llenarBus(asiento);
            pago = pago + b2.getPrecio();
            return b2;
        }
        return null;
    }
    public String getCom(){
        int x = BoletoSalida, y = BoletoLLegada, p = pago, z = asiento;
        String x1 = String.valueOf(x);
        String y1 = String.valueOf(y);
        String p1 = String.valueOf(p);
        String z1 = String.valueOf(z);
        return "Tu viaje es de "+BoletoOrigen+" a "+BoletoDestino+", dia "+BoletoDia+"\n"+"El bus sale a las "+x1+":00 hrs y llega a destino a las "+y1+":00 hrs\nPor el precio de "+p1+", Tu bus es:"+b+",asiento "+z1;
    }
    public int ConfirmarPago(){
        return pago;
    }
}