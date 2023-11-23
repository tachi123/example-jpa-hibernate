package example.hibernate.pyme.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import example.hibernate.pyme.config.DBConfig;
import example.hibernate.pyme.models.Empleado;

public class Controller3 {

	public void otroMetodo(Empleado unEmpleado) {
		
		EntityManager em = DBConfig.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
			unEmpleado.setNombre("Nahuel");
			em.persist(unEmpleado);
		tx.commit();
		
	}
	
	
}
