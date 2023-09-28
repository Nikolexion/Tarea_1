public class Cliente {
    private String nombre;
    private String rut;
    private Direccion direccion;

    public Cliente(String nombre, String rut, String direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion.setDireccion(direccion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}