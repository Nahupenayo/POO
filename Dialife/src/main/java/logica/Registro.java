package logica;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Registro {
   @Id 
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    @OneToOne
   private Datos datosUsuario;

    public Registro() {
    }

    public Registro(String nombre, String apellido, int edad, int documento, Datos datosUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.datosUsuario = datosUsuario;
    }
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Datos getDatosUsuario() {
        return datosUsuario;
    }

    public void setDatosUsuario(Datos datosUsuario) {
        this.datosUsuario = datosUsuario;
    }

   
    
}