import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Date fecha;
    private String estado;

    private ArrayList<DocTributario> tributarioArrayList;
    private ArrayList<DetalleOrden> ordenArraylist;

    private Pago pago;
    private ArrayList<DocTributario> tributarioArrayList;
    private ArrayList<DetalleOrden> detalleordenArraylist;


    public OrdenCompra(String estado, Pago pago) { //según enunciado no debería ser estado, fecha??
        fecha = new Date();
        this.estado = estado;
        this.pago = pago;

        //Inicializacion de Arraylist
        tributarioArrayList = new ArrayList<>();
        detalleordenArraylist = new ArrayList<>();
    }

    public float calcPrecioSinIVA(){

    }
    public float calcIVA(){

    }
    public float calcPrecio(){

    }
    public float calcPeso(){

    }

    //Getters y setters-------------------------------------------------------------------------------------------------

    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pago getPago() {
        return pago;
    }
    public void setPago(Pago pago) {
        this.pago = pago;
    }

    //Funciones para modificar ArrayList Documentos Tributarios---------------------------------------------------------

    public DocTributario getTributarioArrayList() {
        return tributarioArrayList.remove(0);
    }

    public void setTributarioArrayList(DocTributario NuevoDoc) {
        this.tributarioArrayList.add(NuevoDoc);
    }

    //Funciones para modificar ArrayList Detalles de Orden
    public DetalleOrden getDetalleOrdenArraylist(DetalleOrden NuevoDetalle){
        return this.detalleordenArraylist.remove(0);
    }
    public void setDetalleOrdenArraylist(DetalleOrden NuevoDetalle){
        this.detalleordenArraylist.add(NuevoDetalle);
    }

}
