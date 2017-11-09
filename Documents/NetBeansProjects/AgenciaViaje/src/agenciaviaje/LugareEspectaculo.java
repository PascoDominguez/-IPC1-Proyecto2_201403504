
package agenciaviaje;

public class LugareEspectaculo {
    private String codigoLugar;
    private String nombreLugar;
    private String descripcionLugar;
    private String paisLugar;
    private String ciudadLugar;
    private String direccionLugar;
    private String minEdadPermitido;
    private String horainicioActividad;
    private String horaFunciion;
    private String recomendacionSeguridad;
    private String codigoDestino;

    public LugareEspectaculo(String codigoLugar, String nombreLugar, String descripcionLugar, String paisLugar, String ciudadLugar, String direccionLugar, String minEdadPermitido, String horainicioActividad, String horaFunciion, String recomendacionSeguridad, String codigoDestino) {
        this.codigoLugar = codigoLugar;
        this.nombreLugar = nombreLugar;
        this.descripcionLugar = descripcionLugar;
        this.paisLugar = paisLugar;
        this.ciudadLugar = ciudadLugar;
        this.direccionLugar = direccionLugar;
        this.minEdadPermitido = minEdadPermitido;
        this.horainicioActividad = horainicioActividad;
        this.horaFunciion = horaFunciion;
        this.recomendacionSeguridad = recomendacionSeguridad;
        this.codigoDestino = codigoDestino;
    }

    public String getCodigoLugar() {
        return codigoLugar;
    }

    public void setCodigoLugar(String codigoLugar) {
        this.codigoLugar = codigoLugar;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public String getDescripcionLugar() {
        return descripcionLugar;
    }

    public void setDescripcionLugar(String descripcionLugar) {
        this.descripcionLugar = descripcionLugar;
    }

    public String getPaisLugar() {
        return paisLugar;
    }

    public void setPaisLugar(String paisLugar) {
        this.paisLugar = paisLugar;
    }

    public String getCiudadLugar() {
        return ciudadLugar;
    }

    public void setCiudadLugar(String ciudadLugar) {
        this.ciudadLugar = ciudadLugar;
    }

    public String getDireccionLugar() {
        return direccionLugar;
    }

    public void setDireccionLugar(String direccionLugar) {
        this.direccionLugar = direccionLugar;
    }

    public String getMinEdadPermitido() {
        return minEdadPermitido;
    }

    public void setMinEdadPermitido(String minEdadPermitido) {
        this.minEdadPermitido = minEdadPermitido;
    }

    public String getHorainicioActividad() {
        return horainicioActividad;
    }

    public void setHorainicioActividad(String horainicioActividad) {
        this.horainicioActividad = horainicioActividad;
    }

    public String getHoraFunciion() {
        return horaFunciion;
    }

    public void setHoraFunciion(String horaFunciion) {
        this.horaFunciion = horaFunciion;
    }

    public String getRecomendacionSeguridad() {
        return recomendacionSeguridad;
    }

    public void setRecomendacionSeguridad(String recomendacionSeguridad) {
        this.recomendacionSeguridad = recomendacionSeguridad;
    }

    public String getCodigoDestino() {
        return codigoDestino;
    }

    public void setCodigoDestino(String codigoDestino) {
        this.codigoDestino = codigoDestino;
    }
    
    
    
}
