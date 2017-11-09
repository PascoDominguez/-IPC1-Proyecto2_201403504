
package agenciaviaje;

public class Camarots {
    private String codigoCrucero;
    private String codigoReservacion;
    private String numHabAsignadaViajero;
    private String costoPasaje;

    public Camarots(String codigoCrucero, String codigoReservacion, String numHabAsignadaViajero, String costoPasaje) {
        this.codigoCrucero = codigoCrucero;
        this.codigoReservacion = codigoReservacion;
        this.numHabAsignadaViajero = numHabAsignadaViajero;
        this.costoPasaje = costoPasaje;
    }

    public String getCodigoCrucero() {
        return codigoCrucero;
    }

    public void setCodigoCrucero(String codigoCrucero) {
        this.codigoCrucero = codigoCrucero;
    }

    public String getCodigoReservacion() {
        return codigoReservacion;
    }

    public void setCodigoReservacion(String codigoReservacion) {
        this.codigoReservacion = codigoReservacion;
    }

    public String getNumHabAsignadaViajero() {
        return numHabAsignadaViajero;
    }

    public void setNumHabAsignadaViajero(String numHabAsignadaViajero) {
        this.numHabAsignadaViajero = numHabAsignadaViajero;
    }

    public String getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(String costoPasaje) {
        this.costoPasaje = costoPasaje;
    }
    
    
    
}
