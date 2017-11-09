
package agenciaviaje;

public class EntidadFinanciera {
    private String codigoEntidadFinanciera;
    private String codigoCliente;
    private String tipoTarjeta;
    private String codigoTarjeta;
    private String saldo;
    private String montoMaximo;

    public EntidadFinanciera(String codigoEntidadFinanciera, String codigoCliente, String tipoTarjeta, String codigoTarjeta, String saldo, String montoMaximo) {
        this.codigoEntidadFinanciera = codigoEntidadFinanciera;
        this.codigoCliente = codigoCliente;
        this.tipoTarjeta = tipoTarjeta;
        this.codigoTarjeta = codigoTarjeta;
        this.saldo = saldo;
        this.montoMaximo = montoMaximo;
    }

    public String getCodigoEntidadFinanciera() {
        return codigoEntidadFinanciera;
    }

    public void setCodigoEntidadFinanciera(String codigoEntidadFinanciera) {
        this.codigoEntidadFinanciera = codigoEntidadFinanciera;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getCodigoTarjeta() {
        return codigoTarjeta;
    }

    public void setCodigoTarjeta(String codigoTarjeta) {
        this.codigoTarjeta = codigoTarjeta;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(String montoMaximo) {
        this.montoMaximo = montoMaximo;
    }
    
    
    
}
