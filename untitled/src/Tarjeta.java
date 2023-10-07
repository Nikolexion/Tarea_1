import java.util.Date;

class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
    private  float monto;

    public Tarjeta(float monto,String tipo, String numTransaccion){
        super(monto);
        this.monto = monto;
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }
    @Override
    float getMonto() {
        return monto;
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
