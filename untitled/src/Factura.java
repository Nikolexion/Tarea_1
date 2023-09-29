import java.util.Date;

public class Factura extends DocTributario{
    public Factura(String numero, String rut, Date fecha, OrdenCompra ordenCompra) {
        super(numero, rut, fecha, ordenCompra);
    }
}
