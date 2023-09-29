import java.util.Date;

class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;

    public Tarjeta(float monto, Date fecha, String tipo, String numTransaccion){
        super(monto, fecha);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }

    public String getTipo(){
        return tipo;
    }
    public String getNumTransaccion(){
        return numTransaccion;
    }

    @Override
    public String toString(){
        return "Tarjeta"; //Ajustar toString, esta mal empleado
    }
}
