package example.hibernate.pyme.DAO;

import example.hibernate.pyme.models.Empleado;
import example.hibernate.pyme.models.Rol;

public class RolDAO extends AbstractJpaDAO< Rol > {

	   public RolDAO(){
	      setClazz(Rol.class );
	   }
	   
}
