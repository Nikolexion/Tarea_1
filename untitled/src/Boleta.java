import java.util.Date;

public class Boleta extends DocTributario{
    public Boleta(String numero, String rut, Date fecha, OrdenCompra ordenCompra) {
        super(numero, rut, fecha, ordenCompra);
    }
}
