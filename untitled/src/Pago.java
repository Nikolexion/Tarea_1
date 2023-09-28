import java.util.Date;
abstract class Pago {
    private float monto;
    private Date fecha;

    public Pago(float monto, Date fecha){
        this.monto = monto;
        this.fecha = fecha;
    }

    public float getMonto(){
        return monto;
    }
    public Date getFecha(){
        return fecha;
    }
    public abstract String toString();
}

