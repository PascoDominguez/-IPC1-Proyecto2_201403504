
package agenciaviaje;

public class Cruceros {
    private String codigoCrucero;
    private String fechaSalida;
    private String fechaLlegada;
    private String capacidadTotalPasajero;
    private String diasViajeCrucero;
    private String descripcionCrucero;
    private String codigoDestino;

    public Cruceros(String codigoCrucero, String fechaSalida, String fechaLlegada, String capacidadTotalPasajero, String diasViajeCrucero, String descripcionCrucero, String codigoDestino) {
        this.codigoCrucero = codigoCrucero;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.capacidadTotalPasajero = capacidadTotalPasajero;
        this.diasViajeCrucero = diasViajeCrucero;
        this.descripcionCrucero = descripcionCrucero;
        this.codigoDestino = codigoDestino;
    }

    public String getCodigoCrucero() {
        return codigoCrucero;
    }

    public void setCodigoCrucero(String codigoCrucero) {
        this.codigoCrucero = codigoCrucero;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getCapacidadTotalPasajero() {
        return capacidadTotalPasajero;
    }

    public void setCapacidadTotalPasajero(String capacidadTotalPasajero) {
        this.capacidadTotalPasajero = capacidadTotalPasajero;
    }

    public String getDiasViajeCrucero() {
        return diasViajeCrucero;
    }

    public void setDiasViajeCrucero(String diasViajeCrucero) {
        this.diasViajeCrucero = diasViajeCrucero;
    }

    public String getDescripcionCrucero() {
        return descripcionCrucero;
    }

    public void setDescripcionCrucero(String descripcionCrucero) {
        this.descripcionCrucero = descripcionCrucero;
    }

    public String getCodigoDestino() {
        return codigoDestino;
    }

    public void setCodigoDestino(String codigoDestino) {
        this.codigoDestino = codigoDestino;
    }
    
    
    
}
