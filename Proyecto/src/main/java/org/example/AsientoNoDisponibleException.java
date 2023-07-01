package org.example;

/**
 * Esta clase es la excepcion para cuando no haya asientos disponibles
 */

public class AsientoNoDisponibleException extends Exception{
    /**
     *
     * @param error es el mensaje que se le quiera dar cuando lance la excepcion en alguna parte del codigo
     */
    public AsientoNoDisponibleException(String error){
        super(error);
    }
}