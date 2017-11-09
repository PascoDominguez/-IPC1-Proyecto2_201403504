
package agenciaviaje;

public class rentaAutos {
    private String codigoEmpresa;
    private String codigoCliente;
    private String cantidadPasajero;
    private String tipoTerreno;
    private String diasUtilizar;
    private String montoTotalRenta;
    private String fechaEntrega;
    private String fechaDevolucion;
    private String condicionAseguradora;

    public rentaAutos(String codigoEmpresa, String codigoCliente, String cantidadPasajero, String tipoTerreno, String diasUtilizar, String montoTotalRenta, String fechaEntrega, String fechaDevolucion, String condicionAseguradora) {
        this.codigoEmpresa = codigoEmpresa;
        this.codigoCliente = codigoCliente;
        this.cantidadPasajero = cantidadPasajero;
        this.tipoTerreno = tipoTerreno;
        this.diasUtilizar = diasUtilizar;
        this.montoTotalRenta = montoTotalRenta;
        this.fechaEntrega = fechaEntrega;
        this.fechaDevolucion = fechaDevolucion;
        this.condicionAseguradora = condicionAseguradora;
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getCantidadPasajero() {
        return cantidadPasajero;
    }

    public void setCantidadPasajero(String cantidadPasajero) {
        this.cantidadPasajero = cantidadPasajero;
    }

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    public String getDiasUtilizar() {
        return diasUtilizar;
    }

    public void setDiasUtilizar(String diasUtilizar) {
        this.diasUtilizar = diasUtilizar;
    }

    public String getMontoTotalRenta() {
        return montoTotalRenta;
    }

    public void setMontoTotalRenta(String montoTotalRenta) {
        this.montoTotalRenta = montoTotalRenta;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getCondicionAseguradora() {
        return condicionAseguradora;
    }

    public void setCondicionAseguradora(String condicionAseguradora) {
        this.condicionAseguradora = condicionAseguradora;
    }
    
    
    
}
