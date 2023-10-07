import java.util.Date;

class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;

    public Tarjeta(float monto,String tipo, String numTransaccion){
        super(monto);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }
    @Override
    float getMonto() {
        return 0;
    }

    @Override
    Date getFecha() {
        return null;
    }

    public String getTipo(){
        return tipo;
    }
    public String getNumTransaccion(){
        return numTransaccion;
    }

    @Override
    public String toString(){
        return "Tarjeta{" +
                "monto='" + getMonto() + '\'' +
                ", fecha='" + getFecha() + '\'' +
                ", tipo=" + tipo + '\'' +
                ", numTransaccion=" + numTransaccion +
                '}';
    }
}
