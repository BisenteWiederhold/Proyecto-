package org.example;

/**
 * Es la clase para el sistema de reserva y donde el personal elige las caracteristicas de su pasaje
 */
public class SistemaDeReserva {
    private String BoletoOrigen, BoletoDestino, BoletoDia;
    private int BoletoSalida, BoletoLLegada;
    public static final String ubi1 = "Puerto Montt";
    public static final String ubi2 = "Valdivia";
    public static final String ubi3 = "Concepcion";
    public static final String ubi4 = "Santiago";
    public static final String ubi5 = "Valparaiso";
    private int hr1, hr2, hr3,hr4;
    private int pago;
    private Normal bus1;
    private SalonCama bus2;
    private String b;
    private int asiento;

    /**
     *  En el constructor se crea las variables de los parametros del boleto que son origen, destino, dia, salida y  llegada
     *  Tambien se crea la variable pago y se crean los horarios que estan disponibles en la pagina
     *  Se crea tambien un asiento y buses
     */
    public SistemaDeReserva(){
        this.BoletoOrigen = "";
        this.BoletoDestino = "";
        this.BoletoDia = "";
        this.BoletoSalida = 0;
        this.BoletoLLegada = 0;
        this.pago = 0;
        this.hr1 = 7;
        this.hr2 = 8;
        this.hr3 = 10;
        this.hr4 = 16;
        this.asiento=0;
        this.b = "";
        this.bus1 = new Normal();
        this.bus2 = new SalonCama();
    }

    /**
     *
     * @param a recibe el origen elegido por el personal
     * @param b recibe el destino elegido por el personal
     * @param c recibe el dia del viaje elegido por el personal
     * @param d recibe la hora de salida elegido por el personal
     * @return retorna el boleto con los parametros anterios y con el horario de llegada se estima con las horas de duracion aproximadas de un destino a otrode
     * @throws SeRepitenLugaresException Arroja una excepcion si se elige el mismo lugar para origen y destino
     */
    public Boleto elegirBoleto(String a, String b, String c, int d)throws SeRepitenLugaresException{
        if(a == b){
            throw new SeRepitenLugaresException("Tiene que elegir lugares distintos, el origen no puede ser igual que el destino");
        }else{
            BoletoOrigen = a;
            BoletoDestino = b;
            BoletoDia = c;
            BoletoSalida = d;
            if(d == hr1){
                switch (BoletoOrigen) {
                    case "Puerto Montt":
                        if (BoletoDestino == "Valdivia"){
                            BoletoLLegada = d + 3;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            BoletoLLegada = d + 8;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            BoletoLLegada = d + 13;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            BoletoLLegada = d + 14;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Valdivia":
                        if (BoletoDestino == "Puerto Montt"){
                            BoletoLLegada = d + 3;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            BoletoLLegada = d + 10;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            BoletoLLegada = d + 11;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Concepcion":
                        if (BoletoDestino == "Puerto Montt"){
                            BoletoLLegada = d + 8;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            BoletoLLegada = d + 6;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Santiago":
                        if (BoletoDestino == "Puerto Montt"){
                            BoletoLLegada = d + 13;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            BoletoLLegada = d + 10;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            BoletoLLegada = d + 1;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Valparaiso":
                        if (BoletoDestino == "Puerto Montt"){
                            BoletoLLegada = d + 14;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            BoletoLLegada = d + 11;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            BoletoLLegada = d + 6;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            BoletoLLegada = d + 1;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    default:
                }
            }else if(d == hr2){
                switch (BoletoOrigen) {
                    case "Puerto Montt":
                        if (BoletoDestino == "Valdivia"){
                            BoletoLLegada = d + 3;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            BoletoLLegada = d + 8;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            BoletoLLegada = d + 13;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            BoletoLLegada = d + 14;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Valdivia":
                        if (BoletoDestino == "Puerto Montt"){
                            BoletoLLegada = d + 3;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            BoletoLLegada = d + 10;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            BoletoLLegada = d + 11;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Concepcion":
                        if (BoletoDestino == "Puerto Montt"){
                            BoletoLLegada = d + 8;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            BoletoLLegada = d + 6;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Santiago":
                        if (BoletoDestino == "Puerto Montt"){
                            BoletoLLegada = d + 13;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            BoletoLLegada = d + 10;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            BoletoLLegada = d + 1;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Valparaiso":
                        if (BoletoDestino == "Puerto Montt"){
                            BoletoLLegada = d + 14;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            BoletoLLegada = d + 11;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            BoletoLLegada = d + 6;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            BoletoLLegada = d + 1;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    default:
                }
            }else if(d == hr3){
                switch (BoletoOrigen) {
                    case "Puerto Montt":
                        if (BoletoDestino == "Valdivia"){
                            BoletoLLegada = d + 3;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            BoletoLLegada = d + 8;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            BoletoLLegada = d + 13;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            BoletoLLegada = d + 14;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Valdivia":
                        if (BoletoDestino == "Puerto Montt"){
                            BoletoLLegada = d + 3;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            BoletoLLegada = d + 10;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            BoletoLLegada = d + 11;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Concepcion":
                        if (BoletoDestino == "Puerto Montt"){
                            BoletoLLegada = d + 8;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            BoletoLLegada = d + 6;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Santiago":
                        if (BoletoDestino == "Puerto Montt"){
                            BoletoLLegada = d + 13;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            BoletoLLegada = d + 10;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            BoletoLLegada = d + 1;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Valparaiso":
                        if (BoletoDestino == "Puerto Montt"){
                            BoletoLLegada = d + 14;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            BoletoLLegada = d + 11;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            BoletoLLegada = d + 6;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            BoletoLLegada = d + 1;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    default:
                }
            }else if(d == hr4){
                switch (BoletoOrigen) {
                    case "Puerto Montt":
                        if (BoletoDestino == "Valdivia"){
                            BoletoLLegada = d + 3;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            BoletoLLegada = d + 8;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            BoletoLLegada = 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            BoletoLLegada = 6;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Valdivia":
                        if (BoletoDestino == "Puerto Montt"){
                            BoletoLLegada = d + 3;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            BoletoLLegada = 2;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            BoletoLLegada = 3;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Concepcion":
                        if (BoletoDestino == "Puerto Montt"){
                            BoletoLLegada = d + 8;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            BoletoLLegada = d + 6;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Santiago":
                        if (BoletoDestino == "Puerto Montt"){
                            BoletoLLegada = 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            BoletoLLegada = 2;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            BoletoLLegada = d + 5;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valparaiso"){
                            BoletoLLegada = d + 1;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    case "Valparaiso":
                        if (BoletoDestino == "Puerto Montt"){
                            BoletoLLegada = 6;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Valdivia"){
                            BoletoLLegada = 3;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Concepcion"){
                            BoletoLLegada = d + 6;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }else if(BoletoDestino == "Santiago"){
                            BoletoLLegada = d + 1;
                            return new Boleto(BoletoOrigen,BoletoDestino,BoletoDia,BoletoSalida,BoletoLLegada);
                        }
                    default:
                }
            }
        }
        return null;
    }

    /**
     *
     * @param s recibe tipo de bus que elige el personal
     * @param y recibe el numero de asiento que eligio el personal
     * @return el bus al que reservo el personal
     * @throws AsientoNoDisponibleException arroja excepcion si el asiento no esta disponible
     */
    public Bus elegirBusAsiento(String s, int y)throws AsientoNoDisponibleException{
        b = s;
        asiento = y;
        if(b == bus1.getTipo()){
            if(bus1.getasiento(y)!=null){
                pago = bus1.getPrecio();
                return bus1;
            }else{
                throw new AsientoNoDisponibleException("Asiento ocupado o no disponible");
            }
        }else if(b == bus2.getTipo()){
            if(bus2.getasiento(y)!=null){
                pago = bus2.getPrecio();
                return bus2;
            }else{
                throw new AsientoNoDisponibleException("Asiento ocupado o no disponible");
            }
        }
        return null;
    }

    /**
     *
     * @return retorna un string con un mensaje de comprobante que contiene todos los datos de el boleto selecto y el bus y asiento y el pago debido
     */
    public String getCom(){
        int x = BoletoSalida, y = BoletoLLegada, p = pago, z = asiento;
        String x1 = String.valueOf(x);
        String y1 = String.valueOf(y);
        String p1 = String.valueOf(p);
        String z1 = String.valueOf(z);
        return "Tu viaje es de "+BoletoOrigen+" a "+BoletoDestino+", dia "+BoletoDia+"\n"+"El bus sale a las "+x1+":00 hrs y llega a destino a las "+y1+":00 hrs\nPor el precio de "+p1+", Tu bus es:"+b+",asiento "+z1;
    }

    /**
     *
     * @return retorna el total a pagar
     */
    public int ConfirmarPago(){
        return pago;
    }
}