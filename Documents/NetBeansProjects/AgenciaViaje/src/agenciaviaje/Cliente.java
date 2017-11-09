
package agenciaviaje;

public class Cliente {
    private String codigoUnico;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String movil;
    private String numeroTarjeta;
    private String fechaNacimiento;
    private String direccionHabitacion;
    private String c_x_frecuencia;
    private String c_x_monto;

    public Cliente(String codigoUnico, String nombres, String apellidos, String numeroTarjeta, String fechaNacimiento, String telefono, String movil, String direccionHabitacion, String c_x_frecuencia, String c_x_monto) {
        this.codigoUnico = codigoUnico;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.movil = movil;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaNacimiento = fechaNacimiento;
        this.direccionHabitacion = direccionHabitacion;
        this.c_x_frecuencia = c_x_frecuencia;
        this.c_x_monto = c_x_monto;
    }

   public Cliente(){
       
   }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getdireccionHabitacion() {
        return direccionHabitacion;
    }

    public void setdireccionHabitacion(String direccionHabitacion) {
        this.direccionHabitacion = direccionHabitacion;
    }

    public String getC_x_frecuencia() {
        return c_x_frecuencia;
    }

    public void setC_x_frecuencia(String c_x_frecuencia) {
        this.c_x_frecuencia = c_x_frecuencia;
    }

    public String getC_x_monto() {
        return c_x_monto;
    }

    public void setC_x_monto(String c_x_monto) {
        this.c_x_monto = c_x_monto;
    }
    
    
    
    
    
}
