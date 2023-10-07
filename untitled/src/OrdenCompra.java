import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Date fecha;
    private String estado;

    private ArrayList<DocTributario> tributarioArrayList;
    private ArrayList<DetalleOrden> detalleordenArraylist;

    private Pago pago;
    private Articulo articulo;
    private float efectivo;


    public OrdenCompra(Pago pago) { //según enunciado no debería ser estado, fecha??
        estado = "En proceso";
        fecha = new Date();
        this.pago = pago;

        //Inicializacion de Arraylist
        tributarioArrayList = new ArrayList<>();
        detalleordenArraylist = new ArrayList<>();
        this.articulo = new Articulo(10, "xiaomi redmi 12", "celular", 10000);

        efectivo += pago.getMonto();
        if (pago.getMonto() == articulo.getPrecio()){
            estado = "Finalizado";
            System.out.println(estado);
        } else if (efectivo < articulo.getPrecio()){
            estado = "Recibiendo efectivo";
            System.out.println(estado);

        } else {
            estado = "Retornando cambio";
            System.out.println(estado);
            System.out.println(pago.getMonto() - articulo.getPrecio());

        }
    }

    public float calcPrecioSinIVA() {
        float precioSinIVA = (float) (this.articulo.getPrecio() * 0.81);
        return precioSinIVA;
    }
    public float calcIVA() {
        float precioIVA = (float) (this.articulo.getPrecio() * 0.19);
        return precioIVA;
    }
    public float calcPrecio() {
        return this.articulo.getPrecio();
    }
    public float calcPeso() {
        return this.articulo.getPeso();
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
