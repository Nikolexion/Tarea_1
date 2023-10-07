public class Main {
    public static void main(String[] args){

        //Inicializando objetos-----------------------------------------------------------------------------------------

        Pago transferencia = new Transferencia(10000, "Santander", "1");
        Pago efectivo = new Efectivo(11000);
        Pago tarjeta = new Tarjeta(10000, "credito", "2138982139");
        Articulo articulo = new Articulo(10, "xiaomi redmi 12", "celular", 10000);
        DetalleOrden detalleOrden = new DetalleOrden(transferencia,2);
        OrdenCompra ordenCompra = new OrdenCompra(transferencia, detalleOrden, articulo);
        OrdenCompra ordenCompra1 = new OrdenCompra(efectivo, detalleOrden, articulo);
        Direccion direccion = new Direccion("ola 8392");
        Cliente cliente = new Cliente("Tulio", "32132-1", direccion);


        //Prueba de metodos OrdenCompra---------------------------------------------------------------------------------

        System.out.println(ordenCompra.calcPrecioSinIVA());
        System.out.println(ordenCompra.calcPrecio());
        System.out.println(ordenCompra.calcPeso());
        System.out.println(ordenCompra.calcIVA());

        //Prueba de metodos DetalleOrden--------------------------------------------------------------------------------

        System.out.println(detalleOrden.calcPrecioSinIVA());
        System.out.println(detalleOrden.calcPrecio());
        System.out.println(detalleOrden.calcPeso());
        System.out.println(detalleOrden.calcIVA());

        //Prueba de metodos toString------------------------------------------------------------------------------------

        System.out.println(cliente.toString());
        System.out.println(ordenCompra.toString());
        System.out.println(articulo.toString());
        System.out.println(transferencia.toString());
        System.out.println(efectivo.toString());
        System.out.println(tarjeta.toString());

    }
}
