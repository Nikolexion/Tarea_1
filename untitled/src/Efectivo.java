import java.util.Date;

class Efectivo extends Pago{

    public Efectivo(float monto, Date fecha) {
        super(monto, fecha);
    }
    public float calcDevolucion(){ //Falta definir correctamente calcDevolucion
        float f = getMonto();
        return f;
    }

    @Override
    float getMonto() {
        return 0;
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
