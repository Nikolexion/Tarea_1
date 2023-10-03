import java.util.Date;

abstract class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    private OrdenCompra ordenCompra;

    public DocTributario(String numero, String rut, OrdenCompra ordenCompra) {
        this.numero = numero;
        this.rut = rut;
        fecha = new Date();
        this.ordenCompra = ordenCompra;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String toString() {
        return "DocTributario{" +
                "numero='" + numero + '\'' +
                ", rut='" + rut + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
