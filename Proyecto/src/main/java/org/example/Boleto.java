package org.example;

/**
 * Esta clase es para los boletos que guarda las caracteristicas de la compra de pasajes
 */

public class Boleto {
    private String origen, destino;
    private String dia;
    private int salida, llegada;

    /**
     *
     * @param origen es el origen de donde parte el bus y que queda guardada en el boleto
     * @param destino es el destino de donde finaliza el viaje el bus y que queda guardada en el boleto
     * @param dia es el dia de partida del bus del pasaje que queda guardada en el boleto
     * @param salida es la hora de salida del bus, que queda guardada en el boleto que se eligio
     * @param llegada es la hora de salida del bus, que queda guardada en el boleto que se eligio
     */

    public Boleto(String origen, String destino, String dia, int salida, int llegada){
        this.origen = origen;
        this.destino = destino;
        this.dia = dia;
        this.salida = salida;
        this.llegada = llegada;
    }

    /**
     *
     * @return retorna el lugar de partida del bus
     */

    public String getOrigen() {
        return origen;
    }

    /**
     *
     * @return retorna el lugar de destino del viaje
     */
    public String getDestino() {
        return destino;
    }

    /**
     *
     * @return retorna el dia de partida del bus que se le ha asignado al boleto
     */
    public String getDia() {
        return dia;
    }

    /**
     *
     * @return retorna un numero entero que indica la hora de partida del bus
     */
    public int getSalida() {
        return salida;
    }

    /**
     *
     * @return retorna un numero entero que indica la hora estimada de llegada del bus
     */
    public int getLlegada() {
        return llegada;
    }
}



