
package agenciaviaje;

public class R_reservacion {
    private String codigoReser;
    private String codigocliente;
    private String nombrecliente;
    private String apellidoCliente;
    private String CostoViaje;
    private String montoReservacion;
    private String estadoReservacion;

    public R_reservacion(String codigoReser, String codigocliente, String nombrecliente, String apellidoCliente, String CostoViaje, String montoReservacion, String estadoReservacion) {
        this.codigoReser = codigoReser;
        this.codigocliente = codigocliente;
        this.nombrecliente = nombrecliente;
        this.apellidoCliente = apellidoCliente;
        this.CostoViaje = CostoViaje;
        this.montoReservacion = montoReservacion;
        this.estadoReservacion = estadoReservacion;
    }

    public String getCodigoReser() {
        return codigoReser;
    }

    public void setCodigoReser(String codigoReser) {
        this.codigoReser = codigoReser;
    }

    public String getCodigocliente() {
        return codigocliente;
    }

    public void setCodigocliente(String codigocliente) {
        this.codigocliente = codigocliente;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getCostoViaje() {
        return CostoViaje;
    }

    public void setCostoViaje(String CostoViaje) {
        this.CostoViaje = CostoViaje;
    }

    public String getMontoReservacion() {
        return montoReservacion;
    }

    public void setMontoReservacion(String montoReservacion) {
        this.montoReservacion = montoReservacion;
    }

    public String getEstadoReservacion() {
        return estadoReservacion;
    }

    public void setEstadoReservacion(String estadoReservacion) {
        this.estadoReservacion = estadoReservacion;
    }
    
    
    
    
}
