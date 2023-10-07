import java.util.ArrayList;

class DetalleOrden {
    private int cantidad;
    private OrdenCompra ordenCompra;
    private ArrayList<Articulo> articuloArrayList;
    public DetalleOrden(String estado, Pago pago, int cantidad) {
        this.cantidad = cantidad;
        this.ordenCompra = new OrdenCompra(estado, pago);
        articuloArrayList = new ArrayList<>();
    }

    public float calcPrecio() {
        return ordenCompra.calcPrecio();
    }
    public float calcPrecioSinIVA() {
        return ordenCompra.calcPrecioSinIVA();
    }
    public float calcIVA() {
        return ordenCompra.calcIVA();
    }
    public float calcPeso() {
        return ordenCompra.calcPeso();
    }
}
