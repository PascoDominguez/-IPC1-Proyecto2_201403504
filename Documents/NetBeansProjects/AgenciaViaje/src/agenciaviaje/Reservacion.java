
package agenciaviaje;

public class Reservacion {
    private String codigoReservacion;
    private String codigoPaquete;
    private String codigoCliente;
    private String fechaReservacion;
    private String fechaSalida;
    private String cantidadDiasViaje;
    private String estadoReservacion;
    private String saldoPendiente;

    public Reservacion(String codigoReservacion, String codigoPaquete, String codigoCliente, String fechaReservacion, String fechaSalida, String cantidadDiasViaje, String estadoReservacion, String saldoPendiente) {
        this.codigoReservacion = codigoReservacion;
        this.codigoPaquete = codigoPaquete;
        this.codigoCliente = codigoCliente;
        this.fechaReservacion = fechaReservacion;
        this.fechaSalida = fechaSalida;
        this.cantidadDiasViaje = cantidadDiasViaje;
        this.estadoReservacion = estadoReservacion;
        this.saldoPendiente = saldoPendiente;
    }

    public String getCodigoReservacion() {
        return codigoReservacion;
    }

    public void setCodigoReservacion(String codigoReservacion) {
        this.codigoReservacion = codigoReservacion;
    }

    public String getCodigoPaquete() {
        return codigoPaquete;
    }

    public void setCodigoPaquete(String codigoPaquete) {
        this.codigoPaquete = codigoPaquete;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getFechaReservacion() {
        return fechaReservacion;
    }

    public void setFechaReservacion(String fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getCantidadDiasViaje() {
        return cantidadDiasViaje;
    }

    public void setCantidadDiasViaje(String cantidadDiasViaje) {
        this.cantidadDiasViaje = cantidadDiasViaje;
    }

    public String getEstadoReservacion() {
        return estadoReservacion;
    }

    public void setEstadoReservacion(String estadoReservacion) {
        this.estadoReservacion = estadoReservacion;
    }

    public String getSaldoPendiente() {
        return saldoPendiente;
    }

    public void setSaldoPendiente(String saldoPendiente) {
        this.saldoPendiente = saldoPendiente;
    }
    
    
    
}
