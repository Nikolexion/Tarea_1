import java.util.Date;

class Transferencia extends Pago {
    private String banco;
    private String numCuenta;

    public Transferencia(float monto,String banco, String numCuenta) {
        super(monto);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }
    @Override
    float getMonto() {
        return 0;
    }

    @Override
    Date getFecha() {
        return null;
    }

    public String getBanco(){
        return banco;
    }

    public String getNumCuenta(){
        return numCuenta;
    }

    @Override
    public String toString(){
        return "Transferencia{" +
                "monto='" + getMonto() + '\'' +
                ", fecha='" + getFecha() + '\'' +
                ", banco=" + banco + '\'' +
                ", numCuenta=" + numCuenta +
                '}';
    }

}
