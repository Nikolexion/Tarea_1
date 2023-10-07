public class Main {
    public static void Main(String[] args){
        Pago transferencia = new Transferencia(9000, "Santander", "1");
        OrdenCompra ordenCompra = new OrdenCompra(transferencia);
        
    }
}
