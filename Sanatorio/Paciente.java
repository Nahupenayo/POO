package Sanatorio;
public abstract class Paciente {
    protected String dni;
    protected String nombre;
    protected String obraSocial;

    public Paciente(String dni, String nombre, String obraSocial) {
        this.dni = dni;
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public abstract void mostrarDatos();
}

