
package agenciaviaje;

public class r_cliente {
    private String idcliente;
    private String nombre;
    private String apelldio;
    private String destino;
    private String monto;

    public r_cliente(String idcliente, String nombre, String apelldio, String destino, String monto) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.apelldio = apelldio;
        this.destino = destino;
        this.monto = monto;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelldio() {
        return apelldio;
    }

    public void setApelldio(String apelldio) {
        this.apelldio = apelldio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
    
    
    
    
}
