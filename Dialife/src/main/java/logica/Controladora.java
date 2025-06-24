
package logica;

import persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void registrar(String nombrePerso, 
            String apellidoPerson, String edadPerson, 
            String documentoPerson) {
     //Creamos el resgistro y le asignamos sus valores    
        Registro registro = new Registro();  
        registro.setNombre(nombrePerso);
        registro.setApellido(apellidoPerson);
        
     //Creamos los datos y le asignamos sus valores  
        Datos datos =new Datos();
        datos.setAltura(0);
        datos.setPeso(0);
        datos.setGlucosa(0);
        datos.setPresion(0);
        datos.setMedicamentos(edadPerson);
        
        controlPersis.registro(registro, datos);
        
    }
    
    
    
}
