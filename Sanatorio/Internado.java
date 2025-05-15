package Sanatorio;
public class Internado extends Paciente implements Administracion, Nutricion, ClinicaMedica {
    private String habitacion;
    private double presionArterial;
    private String rh;
    private String dieta;

    public Internado(String dni, String nombre, String obraSocial,
                     String habitacion, double presionArterial, String rh, String dieta) {
        super(dni, nombre, obraSocial);
        this.habitacion = habitacion;
        this.presionArterial = presionArterial;
        this.rh = rh;
        this.dieta = dieta;
    }

    @Override
    public String getCobertura() {
        return "Cobertura total en internacion.";
    }

    @Override
    public double getDescuento() {
        return 0.2;
    }

    @Override
    public String getVademecum() {
        return "Medicamentos intravenosos, antibioticos, sueros.";
    }

    @Override
    public String getDieta() {
        return dieta;
    }

    @Override
    public String[] recetarEstudios() {
        return new String[]{"Radiografia", "Analisis de Sangre"};
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Internado: " + nombre + " (" + dni + ")");
        System.out.println("Habitación: " + habitacion + ", P.A: " + presionArterial + ", Rh: " + rh);
    }
}
