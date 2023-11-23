package example.hibernate.pyme.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import example.hibernate.pyme.App;
import example.hibernate.pyme.models.Direccion;
import example.hibernate.pyme.models.Empleado;
import example.hibernate.pyme.services.DireccionService;
import example.hibernate.pyme.services.EmpleadoService;

public class Controller1 {

	public void unMetodo(Empleado unEmpleado) {
		
		EmpleadoService empleadoService = new EmpleadoService();
		
		unEmpleado.setNombre("Nahuel");
		
		empleadoService.create(unEmpleado);
		
		


		DireccionService direccionService = new DireccionService();
		
		direccionService.saveDireccion(new Direccion());
				
	}
	
	
}
