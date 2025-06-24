
package persistencia;

import logica.Datos;
import logica.Registro;

public class ControladoraPersistencia {
    RegistroJpaController resgistroJpa = new RegistroJpaController();
    DatosJpaController datosJpa = new DatosJpaController();

    public void registro(Registro registro, Datos datos) {
      //Crear en la BD el registro  
      resgistroJpa.create(registro);
      
      //Crear en la BD los datos
      datosJpa.create(datos);
    }
    
    
    
}
