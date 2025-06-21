
package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Datos implements Serializable {
    @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private double altura;
    private double peso;
    private double presion;
    private double glucosa;
    private String medicamentos;

    public Datos() {
    }

    public Datos(double altura, double peso, double glucosa, String medicamentos) {
        this.altura = altura;
        this.peso = peso;
        this.glucosa = glucosa;
        this.medicamentos = medicamentos;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    public double getGlucosa() {
        return glucosa;
    }

    public void setGlucosa(double glucosa) {
        this.glucosa = glucosa;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }
    
 

    
    
}
