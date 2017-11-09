
package agenciaviaje;

public class hotelesResorts {
    private String codigoHospedaje;
    private String direccionHospedaje;
    private String totalCuartosDisponible;
    private String codigoDestino;

    public hotelesResorts(String codigoHospedaje, String direccionHospedaje, String totalCuartosDisponible, String codigoDestino) {
        this.codigoHospedaje = codigoHospedaje;
        this.direccionHospedaje = direccionHospedaje;
        this.totalCuartosDisponible = totalCuartosDisponible;
        this.codigoDestino = codigoDestino;
    }

    public String getCodigoHospedaje() {
        return codigoHospedaje;
    }

    public void setCodigoHospedaje(String codigoHospedaje) {
        this.codigoHospedaje = codigoHospedaje;
    }

    public String getDireccionHospedaje() {
        return direccionHospedaje;
    }

    public void setDireccionHospedaje(String direccionHospedaje) {
        this.direccionHospedaje = direccionHospedaje;
    }

    public String getTotalCuartosDisponible() {
        return totalCuartosDisponible;
    }

    public void setTotalCuartosDisponible(String totalCuartosDisponible) {
        this.totalCuartosDisponible = totalCuartosDisponible;
    }

    public String getCodigoDestino() {
        return codigoDestino;
    }

    public void setCodigoDestino(String codigoDestino) {
        this.codigoDestino = codigoDestino;
    }
    
    
    
    
}
