 public class Main {
    public static void main(String[] args) {
        Pediatrico p = new Pediatrico("101", "Lautaro", "OSDE", 25.0, "442933949", "Carlos", "Dieta liviana");
        Adulto a = new Adulto("202", "María", "Swiss Medical", 130.0, 1.65, 70.0);
        Internado i = new Internado("303", "José", "Galeno", "B12", 120.0, "O+", "Dieta líquida");

        Paciente[] pacientes = {p, a, i};

        for (Paciente pac : pacientes) {
            pac.mostrarDatos();
            if (pac instanceof Administracion admin) {
                System.out.println("Cobertura: " + admin.getCobertura());
                System.out.println("Descuento: " + (admin.getDescuento() * 100) + "%");
                System.out.println("Vademecum: " + admin.getVademecum());
            }
            if (pac instanceof Nutricion nutri) {
                System.out.println("Dieta asignada: " + nutri.getDieta());
            }
            if (pac instanceof ClinicaMedica clinica) {
                System.out.println("Estudios requeridos: " + String.join(", ", clinica.recetarEstudios()));
            }
            System.out.println();
        }
    }
}
