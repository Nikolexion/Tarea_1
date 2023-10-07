public class Main {
    public static void main(String[] args){
        Pago transferencia = new Transferencia(9000, "Santander", "1");
        OrdenCompra ordenCompra = new OrdenCompra("En proceso",transferencia);
        Cliente cliente = new Cliente("Tulio", "32132-1", "arco udec");
        Direccion direccion = new Direccion("ola 8392");
        System.out.println(cliente.toString());
    }
}
