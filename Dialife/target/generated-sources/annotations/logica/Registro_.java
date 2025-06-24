package logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Datos;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-06-23T20:44:15", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Registro.class)
public class Registro_ { 

    public static volatile SingularAttribute<Registro, String> apellido;
    public static volatile SingularAttribute<Registro, Datos> datosUsuario;
    public static volatile SingularAttribute<Registro, Integer> documento;
    public static volatile SingularAttribute<Registro, Integer> id;
    public static volatile SingularAttribute<Registro, String> nombre;
    public static volatile SingularAttribute<Registro, Integer> edad;

}