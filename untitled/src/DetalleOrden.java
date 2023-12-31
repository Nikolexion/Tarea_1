import java.util.ArrayList;

class DetalleOrden {
    private int cantidad;
    private OrdenCompra ordenCompra;
    private ArrayList<Articulo> articuloArrayList;

    public DetalleOrden(Pago pago, int cantidad) {
        this.cantidad = cantidad;
        this.ordenCompra = new OrdenCompra(pago, this);

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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
