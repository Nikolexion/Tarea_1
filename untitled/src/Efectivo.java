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
    public String toString(){
        return "Efectivo"; //Ajustar toString, esta mal empleado
    }
}
