
package agenciaviaje;

public class Transporte {
    private String codigoTransporte;
    private String horarioSalida;
    private String horarioLlegada;
    private String CapacidadTotlPasajero;
    private String codigoDestino;

    public Transporte(String codigoTransporte, String horarioSalida, String horarioLlegada, String CapacidadTotlPasajero, String codigoDestino) {
        this.codigoTransporte = codigoTransporte;
        this.horarioSalida = horarioSalida;
        this.horarioLlegada = horarioLlegada;
        this.CapacidadTotlPasajero = CapacidadTotlPasajero;
        this.codigoDestino = codigoDestino;
    }
    
    Transporte(){
        
    }

    public String getCodigoTransporte() {
        return codigoTransporte;
    }

    public void setCodigoTransporte(String codigoTransporte) {
        this.codigoTransporte = codigoTransporte;
    }

    public String getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(String horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public String getHorarioLlegada() {
        return horarioLlegada;
    }

    public void setHorarioLlegada(String horarioLlegada) {
        this.horarioLlegada = horarioLlegada;
    }

    public String getCapacidadTotlPasajero() {
        return CapacidadTotlPasajero;
    }

    public void setCapacidadTotlPasajero(String CapacidadTotlPasajero) {
        this.CapacidadTotlPasajero = CapacidadTotlPasajero;
    }

    public String getCodigoDestino() {
        return codigoDestino;
    }

    public void setCodigoDestino(String codigoDestino) {
        this.codigoDestino = codigoDestino;
    }
    
    
    
    
    
}
