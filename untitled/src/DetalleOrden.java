class DetalleOrden extends OrdenCompra {
    private int cantidad;
    private OrdenCompra ordenCompra;
    private Articulo articulo;
    public DetalleOrden(String estado, Pago pago, int cantidad) {
        super(estado, pago);
        this.cantidad = cantidad;
        this.ordenCompra = new OrdenCompra(estado, pago);

        //Agregamos un articulo arbitrario
        this.articulo = new Articulo(10, "xiaomi redmi 12", "celular", 12000);

    }

    public float calcPrecio() {
        return this.articulo.getPrecio();
    }
    public float calcPrecioSinIVA() {
        float precioSinIVA = (float) (this.articulo.getPrecio() * 0.81);
        return precioSinIVA;
    }
    public float calcIVA() {
        float precioIVA = (float) (this.articulo.getPrecio() * 0.19);
        return precioIVA;
    }
    public float calcPeso() {
        return this.articulo.getPeso();
    }
}
