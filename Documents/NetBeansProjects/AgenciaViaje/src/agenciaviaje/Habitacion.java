
package agenciaviaje;

public class Habitacion {
    private String codigoHospedaje;
    private String numeroHabitacion;
    private String codigoReservacion;
    private String cantidadPersonasHabitacion;
    private String costoHabitacion;
    private String claseHabitacion;

    public Habitacion(String codigoHospedaje, String numeroHabitacion, String codigoReservacion, String cantidadPersonasHabitacion, String costoHabitacion, String claseHabitacion) {
        this.codigoHospedaje = codigoHospedaje;
        this.numeroHabitacion = numeroHabitacion;
        this.codigoReservacion = codigoReservacion;
        this.cantidadPersonasHabitacion = cantidadPersonasHabitacion;
        this.costoHabitacion = costoHabitacion;
        this.claseHabitacion = claseHabitacion;
    }

    public String getCodigoHospedaje() {
        return codigoHospedaje;
    }

    public void setCodigoHospedaje(String codigoHospedaje) {
        this.codigoHospedaje = codigoHospedaje;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getCodigoReservacion() {
        return codigoReservacion;
    }

    public void setCodigoReservacion(String codigoReservacion) {
        this.codigoReservacion = codigoReservacion;
    }

    public String getCantidadPersonasHabitacion() {
        return cantidadPersonasHabitacion;
    }

    public void setCantidadPersonasHabitacion(String cantidadPersonasHabitacion) {
        this.cantidadPersonasHabitacion = cantidadPersonasHabitacion;
    }

    public String getCostoHabitacion() {
        return costoHabitacion;
    }

    public void setCostoHabitacion(String costoHabitacion) {
        this.costoHabitacion = costoHabitacion;
    }

    public String getClaseHabitacion() {
        return claseHabitacion;
    }

    public void setClaseHabitacion(String claseHabitacion) {
        this.claseHabitacion = claseHabitacion;
    }
    
    
    
    
}
