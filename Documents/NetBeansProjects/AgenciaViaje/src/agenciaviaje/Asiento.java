
package agenciaviaje;

public class Asiento {
    private String codigoTransporte;
    private String codigoReservacion;
    private String numeroAsientoViajero;
    private String claseAsiento;
    private String cosotPasaje;

    public Asiento(String codigoTransporte, String codigoReservacion, String numeroAsientoViajero, String claseAsiento, String cosotPasaje) {
        this.codigoTransporte = codigoTransporte;
        this.codigoReservacion = codigoReservacion;
        this.numeroAsientoViajero = numeroAsientoViajero;
        this.claseAsiento = claseAsiento;
        this.cosotPasaje = cosotPasaje;
    }

    public String getCodigoTransporte() {
        return codigoTransporte;
    }

    public void setCodigoTransporte(String codigoTransporte) {
        this.codigoTransporte = codigoTransporte;
    }

    public String getCodigoReservacion() {
        return codigoReservacion;
    }

    public void setCodigoReservacion(String codigoReservacion) {
        this.codigoReservacion = codigoReservacion;
    }

    public String getNumeroAsientoViajero() {
        return numeroAsientoViajero;
    }

    public void setNumeroAsientoViajero(String numeroAsientoViajero) {
        this.numeroAsientoViajero = numeroAsientoViajero;
    }

    public String getClaseAsiento() {
        return claseAsiento;
    }

    public void setClaseAsiento(String claseAsiento) {
        this.claseAsiento = claseAsiento;
    }

    public String getCosotPasaje() {
        return cosotPasaje;
    }

    public void setCosotPasaje(String cosotPasaje) {
        this.cosotPasaje = cosotPasaje;
    }
    
    
    
}
