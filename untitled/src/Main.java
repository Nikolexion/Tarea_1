public class Main {
    public static void main(String[] args){
        Pago transferencia = new Transferencia(10000, "Santander", "1");
        Pago efectivo = new Efectivo(11000);
        OrdenCompra ordenCompra = new OrdenCompra(transferencia);
        OrdenCompra ordenCompra1 = new OrdenCompra(efectivo);
        Direccion direccion = new Direccion("ola 8392");
        Cliente cliente = new Cliente("Tulio", "32132-1", direccion);
        System.out.println(cliente.toString());

    }
}
