import java.util.Date;

public class Factura extends DocTributario{
    public Factura(String numero, String rut, Direccion direccion, OrdenCompra ordenCompra) {
        super(numero, rut, direccion,ordenCompra);
    }
}
