package agenciaviaje;

public class Metodo {
    public static Cliente misClientes[] = new Cliente[100];
    public static int conCl = 0;
    
    public static Transporte misTransportes[] = new Transporte[100];
    public static int conTrans= 0;
    
    public static hotelesResorts mishotelesResorts[] = new hotelesResorts[100];
    public static int conHotel = 0;
    
    public static Cruceros misCruceros[] = new Cruceros[100];
    public static int conCrucero = 0;
    
    public static EntidadFinanciera misEntidadFinanciera[] =  new EntidadFinanciera[100];
    public static int conFinan = 0;
    
    public static DestinoTuristico misDestinoTuristico[] = new DestinoTuristico[100];
    public static int conDestino = 0;
    
    public static LugareEspectaculo misLugareEspectaculo[] = new LugareEspectaculo[100];
    public static int conLugar = 0;
    
    public static Paquetes misPaquetes[] = new Paquetes[100];
    public static int conPaquete= 0 ;
    
    public static Reservacion misReservacion[] = new Reservacion[100];
    public static int conRes=0;
    
    public static rentaAutos misrentaAutos[] = new rentaAutos[100];
    public static int conAutos=0;
    
    public static Asiento misAsiento[] = new Asiento[100];
    public static int conAsiento = 0;
    
    public static Habitacion misHabitacion[] = new Habitacion[100];
    public static int conHabitacion=0;
    
    public static Camarots misCamarots[] = new Camarots[100];
    public static int conCamarots=0;
    
    
    public Metodo() {
//        cargarClientes();
//        this.cargarTransporte();
    }
    // ************* METODO TRANSPORTE *****************************************
    public Transporte[] getTransportes() {
        return misTransportes;
    }


    public void agregarTransporte(Transporte miTransporte) {
        misTransportes[conTrans] = miTransporte;
        conTrans++;
    }
    
    public int numeroTransporte(){
        return conTrans;
    }

    //**********************METODO HOTELES RESORTS *****************************
    public hotelesResorts[] gethotelesResorts(){
        return mishotelesResorts;
    }
    
    public void agregarHotelesResorts(hotelesResorts mihotelesResorts){
        mishotelesResorts[conHotel]  = mihotelesResorts;
        conHotel++;
    }
    
    public int numeroHotelResorts(){
        return conHotel;
    }
    
    //********************* CRUCEROS    ****************************************
    public Cruceros[] getCruceros(){
        return misCruceros;
    }
    
    public void agregarCruceros(Cruceros miCruceros){
        misCruceros[conCrucero] = miCruceros;
        conCrucero++;
    }
    
    public int numeroCruceros(){
        return conCrucero;
    }
    
    // *********************    entidad financiera  ****************************
    public EntidadFinanciera[] getEntidadFinanciera(){
        return misEntidadFinanciera;
    }
    
    public void agregarEntidadFinanciera(EntidadFinanciera miEntidadFinanciera){
        misEntidadFinanciera[conFinan]  =miEntidadFinanciera;
        conFinan++;
    }
    
    public int numeroEntidadFinanciera(){
        return conFinan;
    }
    
  // ********************** METODO CLIENTES ************************************  

    public Cliente[] getClientes() {
        return misClientes;
    }


    public void agregarcliente(Cliente miCliente) {
        misClientes[conCl] = miCliente;
        conCl++;
//        return "Cliente agregado correctamente";
    }

    public int numeroCliente(){
        return conCl;
    }
    
    //************************* destino turistico   ****************************
    public DestinoTuristico[] getDestinoTuristico(){
        return misDestinoTuristico;
    }
    
    public void agregarDestinoTuristico(DestinoTuristico miDestinoTuristico){
        misDestinoTuristico[conDestino] = miDestinoTuristico;
        conDestino++;
    }
    public int numeroDestinoTuristico(){
        return conDestino;
    }
    
    //***************************** lugares espectaculo ************************
    public LugareEspectaculo[] getLugareEspectaculo(){
        return misLugareEspectaculo;
    }
    public void agregarLugareEspectaculo(LugareEspectaculo miLugareEspectaculo){
        misLugareEspectaculo[conLugar] = miLugareEspectaculo;
        conLugar++;
    }
    public int numeroLugareEspectaculo(){
        return conLugar;
    }
    
    //********************************  paquetes    ****************************
    public Paquetes[] getPaquetes(){
        return misPaquetes;
    }
    public void agregarPaquetes(Paquetes miPaquetes){
        misPaquetes[conPaquete] = miPaquetes;
        conPaquete++;
    }
    public int numeroPaquetes(){
        return conPaquete;
    }
    
    //**********************************  reservacion ****************************
    
    public Reservacion[] getReservacion(){
        return misReservacion;
    }
    public void agregarReservacion(Reservacion miReservacion){
        misReservacion[conRes] = miReservacion;
        conRes++;
    }
    public int numeroReservacion(){
        return conRes;
    }
    //************************************  renta auntos    ********************
    public rentaAutos[] getrentaAutos(){
        return misrentaAutos;
    }
    public void agregarrentaAutos(rentaAutos mirentaAutos){
        misrentaAutos[conAutos] = mirentaAutos;
        conAutos++;
    }
    public int numerorentaAutos(){
        return conAutos;
    }
   //*************************  asiento ****************************************
    public Asiento[] getAsiento(){
        return misAsiento;
    }
    public void agregarAsiento(Asiento miAsiento){
        misAsiento[conAsiento] =  miAsiento;
        conAsiento++;
    }
    public int numeroAsiento(){
        return conAsiento;
    }

    //************************* habitacion *************************************
    public Habitacion[] getHabitacion(){
        return misHabitacion;
    }
    public void agregarHabitacion(Habitacion miHabitacion){
        misHabitacion[conHabitacion] = miHabitacion;
        conHabitacion++;
    }
    public int numeroHabitacion(){
        return conHabitacion;
    }
    
    //**********************    camarotes   ************************************
    public Camarots[] getCamarots(){
        return misCamarots;
    }
    public void agregarCamarots(Camarots miCamarots){
        misCamarots[conCamarots]= miCamarots;
        conCamarots++;
    }
    public int numeroCamarots(){
        return conCamarots;
    }
    
    //**************************************************************************
    //**************                reportes                ********************
    //**************************************************************************
    public static r_cliente misr_cliente[] = new r_cliente[100];
    public static int conr_cliente = 0;
    
    public r_cliente[] getr_cliente(){
        return misr_cliente;
    }
    public void agregarr_cliente(r_cliente mir_cliente){
        misr_cliente[conr_cliente] = mir_cliente;
        conr_cliente++;
    }
    public int numeror_cliente(){
        return conr_cliente;
    }
    
    
}

/*

 File Ffichero = new File("05 Clientes.csv");
    //procedimiento para guardar en archivo txt
public void guardarArchivo(Cliente miCliente) {
        try {
            FileWriter fw = new FileWriter(Ffichero, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(miCliente.getCodigoUnico());
            pw.print("," + miCliente.getNombres());
            pw.print("," + miCliente.getApellidos());
            pw.print("," + miCliente.getNumeroTarjeta());
            pw.print("," + miCliente.getFechaNacimiento());
            pw.print("," + miCliente.getTelefono());
            pw.print("," + miCliente.getMovil());
            pw.print("," + miCliente.getdireccionHabitacion());
            pw.print("," + miCliente.getC_x_frecuencia());
            pw.println("," + miCliente.getC_x_monto());
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


    public void renombrarArchivo(String antiguo, String nuevo) {
        File aAntiguio = new File(antiguo);
        File aNuevo = new File(nuevo);
        aAntiguio.renameTo(aNuevo);
    }

    public void eliminarFichero(String archivo) {
        try {
            File fichero = new File(archivo);
            if (fichero.delete()) {
                JOptionPane.showMessageDialog(null, "eliminado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "no eliminado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

*/