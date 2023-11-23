package example.hibernate.pyme;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import example.hibernate.pyme.config.DBConfig;
import example.hibernate.pyme.models.Direccion;
import example.hibernate.pyme.models.Empleado;
import example.hibernate.pyme.models.Sector;
import example.hibernate.pyme.services.DireccionService;
import example.hibernate.pyme.services.EmpleadoService;

public class App 
{
	public static void main(String[] args) {
		EmpleadoService empleadoService = new EmpleadoService();
		DireccionService direccionService = new DireccionService();

		empleadoService.create(new Empleado("prueba nahuel"));
		
		direccionService.saveDireccion(new Direccion());
		
		//Obtener un empleado con id = 1
		Empleado unEmpleado = empleadoService.findOne(1);
		
		List<Empleado> empleados = empleadoService.findAll();

		System.out.println(unEmpleado.getNombre());

	}

	public static void oldMain() {
		
		EntityManager em = DBConfig.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
			em.persist(new Empleado("Matias"));
		tx.commit();
	}
	
	
}
