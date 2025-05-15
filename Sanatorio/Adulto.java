package Sanatorio;
public class Adulto extends Paciente implements Administracion, ClinicaMedica {
    private double presionArterial;
    private double altura;
    private double peso;

    public Adulto(String dni, String nombre, String obraSocial,
                  double presionArterial, double altura, double peso) {
        super(dni, nombre, obraSocial);
        this.presionArterial = presionArterial;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String getCobertura() {
        return "Cobertura general para adultos.";
    }

    @Override
    public double getDescuento() {
        return 0.1; // 10%
    }

    @Override
    public String getVademecum() {
        return "Ibuprofeno, Paracetamol, Enalapril.";
    }

    @Override
    public String[] recetarEstudios() {
        return new String[]{"Radiografía", "Análisis de Sangre"};
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Adulto: " + nombre + " (" + dni + ")");
        System.out.println("Altura: " + altura + ", Peso: " + peso + ", P.A: " + presionArterial);
    }
}


