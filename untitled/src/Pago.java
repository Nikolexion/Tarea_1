import java.util.Date;
abstract class Pago {
    private float monto;
    private Date fecha;

    public Pago(float monto){
        this.monto = monto;
        fecha = new Date();
    }

    abstract float getMonto();
    abstract Date getFecha();

    @Override
    public String toString() {
        return "Pago{" +
                "monto=" + monto +
                ", fecha=" + fecha +
                '}';
    }
}

