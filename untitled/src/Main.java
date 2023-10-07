public class Main {
    public static void main(String[] args){
        Pago transferencia = new Transferencia(10000, "Santander", "1");
        Pago efectivo = new Efectivo(11000);
        DetalleOrden detalleOrden = new DetalleOrden(transferencia,2);
        OrdenCompra ordenCompra = new OrdenCompra(transferencia, detalleOrden);
        OrdenCompra ordenCompra1 = new OrdenCompra(efectivo, detalleOrden);
        Direccion direccion = new Direccion("ola 8392");
        Cliente cliente = new Cliente("Tulio", "32132-1", direccion);


        System.out.println(cliente.toString());
        System.out.println(ordenCompra.calcPrecioSinIVA());
        System.out.println(ordenCompra.calcPrecio());
        System.out.println(ordenCompra.calcPeso());
        System.out.println(ordenCompra.calcIVA());

        System.out.println(detalleOrden.calcPrecioSinIVA());
        System.out.println(detalleOrden.calcPrecio());
        System.out.println(detalleOrden.calcPeso());
        System.out.println(detalleOrden.calcIVA());


    }
}
