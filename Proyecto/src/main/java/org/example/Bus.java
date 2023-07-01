package org.example;

import java.util.ArrayList;

public abstract class Bus {
    private ArrayList<Integer> asiento;
    public Bus(){
        this.asiento = new ArrayList<>(20);
        for(int i=0; i<20; i++){
            this.asiento.add(1);
        }
    }
    public abstract String getTipo();
    public abstract int getPrecio();
    public Integer getasiento(int a){
        int b = asiento.get(a-1);
        if (b == 1){
            asiento.remove(a-1);
            return 1;
        }else{
            return null;
        }
    }
}
class Normal extends Bus{
    private String tipo = "Normal";
    private int precio = 14000;

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
    private int a = 18000;
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
