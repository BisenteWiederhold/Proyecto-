package org.example;

import java.util.ArrayList;

/**
 *  es una clase abstracta de los busesque tiene dos tipos: buses normales o estandar y los salon cama
 */
public abstract class Bus {
    private ArrayList<Integer> asiento;

    /**
     * Es el contructor de la clase donde a los buses se les aplica un arraylist de 20 espacios que indica la cantidad de asientos disponibles que hay por bus, si cada espacio tiene un 1 significa que esta disponible
     */
    public Bus(){
        this.asiento = new ArrayList<>(20);
        for(int i=0; i<20; i++){
            this.asiento.add(1);
        }
    }

    /**
     *
     * @return esta clase abstracta sirve para que dependiendo de la clase del bus retorne si es normal o salon cama
     */
    public abstract String getTipo();

    /**
     *
     * @return esta clase abstracta sirve para que dependiendo de la clase del bus retorne si vale 14000 0 18000
     */
    public abstract int getPrecio();

    /**
     *
     * @param a indica el asiento escogido y se encarga de eliminarlo y y marcarlo como ocupado
     * @return retorna un 1 si es que en la poscicion del arreglo hay un uno y no esta ocupado y ocupara ese asiento, si retorna null esque el asiento no esta disponible
     */
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

/**
 * Esta clase hereda a la clase de bus ya que es un tipo de buses que son los normales que contiene el precio y el tipo
 */
class Normal extends Bus{
    private String tipo = "Normal";
    private int precio = 14000;

    /**
     * es el contructor de la subclase que hereda lo mismo de la clase de Bus
     */

    public Normal(){
        super();
    }

    /**
     *
     * @return retorna normal que es el tipo de bus de esta clase
     */

    public String getTipo(){
        return tipo;
    }

    /**
     *
     * @return retorna 14000 que es el precio del bus de esta clase
     */
    public int getPrecio(){
        return precio;
    }
}

/**
 * Esta subclase hereda a la clase de bus ya que es un tipo de buses que son los salon cama que contiene el precio y el tipo
 */
class SalonCama extends Bus{
    private String tipo = "SalonCama";
    private int a = 18000;

    /**
     * es el contructor de la subclase que hereda lo mismo de la clase de Bus
     */
    public SalonCama(){
        super();
    }

    /**
     *
     * @return retorna salon cama que es el tipo de bus de esta clase
     */

    public String getTipo(){
        return tipo;
    }

    /**
     *
     * @return retorna 18000 que es el precio del bus de esta clase
     */
    public int getPrecio(){
        return a;
    }
}
