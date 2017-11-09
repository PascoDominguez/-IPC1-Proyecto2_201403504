
package agenciaviaje;

public class DestinoTuristico {
    private String codigoDestino;
    private String paisDestino;
    private String ciudadDestino;
    private String direccionDestino;
    private String nombreDestino;
    private String descripcionDestino;
    private String descripcionMedidasSeguridad;

    public DestinoTuristico(String codigoDestino, String paisDestino, String ciudadDestino, String direccionDestino, String nombreDestino, String descripcionDestino, String descripcionMedidasSeguridad) {
        this.codigoDestino = codigoDestino;
        this.paisDestino = paisDestino;
        this.ciudadDestino = ciudadDestino;
        this.direccionDestino = direccionDestino;
        this.nombreDestino = nombreDestino;
        this.descripcionDestino = descripcionDestino;
        this.descripcionMedidasSeguridad = descripcionMedidasSeguridad;
    }

    public String getCodigoDestino() {
        return codigoDestino;
    }

    public void setCodigoDestino(String codigoDestino) {
        this.codigoDestino = codigoDestino;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public String getNombreDestino() {
        return nombreDestino;
    }

    public void setNombreDestino(String nombreDestino) {
        this.nombreDestino = nombreDestino;
    }

    public String getDescripcionDestino() {
        return descripcionDestino;
    }

    public void setDescripcionDestino(String descripcionDestino) {
        this.descripcionDestino = descripcionDestino;
    }

    public String getDescripcionMedidasSeguridad() {
        return descripcionMedidasSeguridad;
    }

    public void setDescripcionMedidasSeguridad(String descripcionMedidasSeguridad) {
        this.descripcionMedidasSeguridad = descripcionMedidasSeguridad;
    }
    
    
    
}
