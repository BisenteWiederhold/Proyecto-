package org.example;

/**
 * Es el personal de la empresa que prueba el sistema de resereva que tendra que pagar y elegir las caracteristicas de su pasaje y boleto
 */
public class PersonalEmpresa {
    private int costo;
    private String comprobante;

    /**
     *
     * @param sist indica que el personal ha ingresado al sistema de reserva para comprar un pasaje
     * @param Origen recibe el el origen del viaje que se quiere comprar
     * @param Destino es el destino del viaje de donde se quiere ir
     * @param dia el dia elegio a viajar
     * @param HoraSalida la hora de salida escogida para salir
     * @param TipoBus el bus en donde se quiere viajar, ya sea normal o salon cama
     * @param asiento el asiento que se quiere escoger
     * @throws AsientoNoDisponibleException arroja la excepcion si no quedan asientos disponibles o uno en concreto que ya se reservo
     * @throws SeRepitenLugaresException arrija excepcion si el destino y origen son iguales ya que eso no debe pasar
     */
    public PersonalEmpresa(SistemaDeReserva sist, String Origen, String Destino, String dia, int HoraSalida, String TipoBus, int asiento ) throws AsientoNoDisponibleException, SeRepitenLugaresException {
        Boleto boleto = sist.elegirBoleto(Origen,Destino,dia,HoraSalida);
        Bus bus = sist.elegirBusAsiento(TipoBus,asiento);
        String s = sist.getCom();
        this.comprobante = s;
        this.costo = sist.ConfirmarPago();
    }

    /**
     *
     * @return retorna el dinero de cuanto se pago que se obtuvo en una funcion en el constructor
     */
    public int CuantoPague(){
        return costo;
    }

    /**
     *
     * @return retorna el comprobante de tu viaje que tiene toda la informacion de los parametros del constructor mas la hora de salida
     */
    public String VerComprobante(){
        return comprobante;
    }
}
