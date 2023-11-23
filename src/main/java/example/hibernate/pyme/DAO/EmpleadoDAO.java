package example.hibernate.pyme.DAO;

import example.hibernate.pyme.models.Empleado;

public class EmpleadoDAO extends AbstractJpaDAO< Empleado > {

   public EmpleadoDAO(){
      setClazz(Empleado.class );
   }
   
}
