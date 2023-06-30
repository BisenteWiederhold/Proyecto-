package org.example;

public class Boleto {
    private String origen, destino;
    private String dia;
    private int salida, llegada;

    public Boleto(String a, String b, String c, int d, int e){
        this.origen = a;
        this.destino = b;
        this.dia = c;
        this.salida = d;
        this.llegada = e;
    }
    public String getOrigen() {
        return origen;
    }
    public String getDestino() {
        return destino;
    }
    public String getDia() {
        return dia;
    }
    public int getSalida() {
        return salida;
    }
    public int getLlegada() {
        return llegada;
    }
}
