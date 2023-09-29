import java.util.Date;

class Transferencia extends Pago {
    private String banco;
    private String numCuenta;

    public Transferencia(float monto, Date fecha, String banco, String numCuenta) {
        super(monto, fecha);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }

    public String getBanco(){
        return banco;
    }

    public String getNumCuenta(){
        return numCuenta;
    }

    @Override
    public String toString(){
        return "Transferencia"; //Ajustar toString, esta mal empleado
    }

}
