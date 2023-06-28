package org.example;

public abstract class Asientos {

    public Asientos(){
    }

    public Asientos getSerie(){
        return this;
    }
    public abstract String getTipo();
    public abstract int getPrecio();

}

class Normal extends Asientos{
    private String tipo = "normal";
    private int a = 100;

    public Normal(){
        super();
    }

    public String getTipo(){
        return tipo;
    }
    public int getPrecio(){
        return a;
    }
}
class SalonCama extends Asientos{
    private String tipo = "SalonCama";
    private int a = 500;

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
