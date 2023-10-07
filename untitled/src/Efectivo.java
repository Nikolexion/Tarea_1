import java.util.Date;

class Efectivo extends Pago{
    private float monto;

    public Efectivo(float monto) {
        super(monto);
        this.monto = monto;
    }
    public float calcDevolucion(float pago){ //Falta definir correctamente calcDevolucion
        float f;
        if (pago >= getMonto()){
             f = pago - getMonto();
        } else {
            return pago;
        }
        return f;
    }

    @Override
    float getMonto() {
        return monto;
    }

    @Override
    Date getFecha() {
        return null;
    }

    @Override
    public String toString(){
        return "Efectivo{" +
                "monto='" + getMonto() + '\'' +
                ", fecha='" + getFecha() +
                '}';
    }
}
