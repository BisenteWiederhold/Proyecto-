package org.example;

public class Boleto {
    private String origen, destino;
    private String dia;
    private int salida, llegada;

    public Boleto(String origen, String destino, String dia, int salida, int llegada){
        this.origen = origen;
        this.destino = destino;
        this.dia = dia;
        this.salida = salida;
        this.llegada = llegada;
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

