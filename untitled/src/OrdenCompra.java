import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Date fecha;
    private String estado;

    private DocTributario docTributario;

    private DetalleOrden detalleOrden;
    private Pago pago;
    private Articulo articulo;
    private float efectivo;


    public OrdenCompra(Pago pago, DetalleOrden detalleOrden, Articulo articulo) {
        estado = "En proceso";
        fecha = new Date();
        this.pago = pago;
        this.detalleOrden = detalleOrden;
        this.articulo = articulo;

        efectivo += pago.getMonto();
        if (pago.getMonto() == articulo.getPrecio() * detalleOrden.getCantidad()) {
            estado = "Finalizado";
            System.out.println(estado);
        } else if (efectivo < articulo.getPrecio() * detalleOrden.getCantidad()) {
            estado = "Recibiendo efectivo";
            System.out.println(estado);

        } else {
            estado = "Retornando cambio";
            System.out.println(estado);
            System.out.println(pago.getMonto() - articulo.getPrecio());

        }
    }

    public float calcPrecioSinIVA() {
        float precioSinIVA = (float) ((this.articulo.getPrecio() * 0.81) * detalleOrden.getCantidad());
        return precioSinIVA;
    }

    public float calcIVA() {
        float precioIVA = (float) (this.articulo.getPrecio() * 0.19 * detalleOrden.getCantidad());
        return precioIVA;
    }

    public float calcPrecio() {
        return this.articulo.getPrecio() * detalleOrden.getCantidad();
    }

    public float calcPeso() {
        return this.articulo.getPeso() * detalleOrden.getCantidad();
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

}


