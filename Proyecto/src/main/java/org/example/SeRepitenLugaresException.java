package org.example;

/**
 * Esta clase es para la excepcion por si se repiten lugares de destino y origen
 */
public class SeRepitenLugaresException extends Exception{
    /**
     *
     * @param error es el mensaje que se le quiera dar cuando lance la excepcion en alguna parte del codigo
     */
    public SeRepitenLugaresException(String error){
        super(error);
    }
}

