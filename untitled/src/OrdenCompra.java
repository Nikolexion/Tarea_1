import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private ArrayList<DocTributario> tributarioArrayList;
    //private ArrayList<DetalleOrden> ordenArraylist;
    private Pago pago;

    public OrdenCompra(String estado, Pago pago) {
        fecha = new Date();
        this.estado = estado;
        this.pago = pago;
    }

    public void calcPrecioSinIVA(){

    }
    public void calcIVA(){

    }
    public void calcPrecio(){

    }
    public void calcPeso(){

    }

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

    public DocTributario getTributarioArrayList() {
        return tributarioArrayList.remove(0);
    }

    public void setTributarioArrayList(DocTributario NuevoDoc) {
        this.tributarioArrayList.add(NuevoDoc);
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
}
