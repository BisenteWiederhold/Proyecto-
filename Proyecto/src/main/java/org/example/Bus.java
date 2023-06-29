package org.example;

import java.util.ArrayList;

public abstract class Bus {
    private ArrayList<Boleto> asiento;

    public Bus(){
        this.asiento = new ArrayList<>(20);
    }
    public abstract String getTipo();
    public abstract int getPrecio();
    public void llenarBus(int a){
        asiento.remove(a);
    }
}

class Normal extends Bus{
    private String tipo = "normal";
    private int precio = 5000;

    public Normal(){
        super();
    }

    public String getTipo(){
        return tipo;
    }
    public int getPrecio(){
        return precio;
    }
}
class SalonCama extends Bus{
    private String tipo = "SalonCama";
    private int a = 7000;

    public SalonCama(){
        super();
    }

    public String getTipo(){
        return tipo;
    }
    public int getPrecio(){
        return a;
    }
}
