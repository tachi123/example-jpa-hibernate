package example.hibernate.pyme.services;

import java.util.Collection;

import example.hibernate.pyme.DAO.DAO;
import example.hibernate.pyme.DAO.DireccionDAO;
import example.hibernate.pyme.models.Direccion;

public class DireccionService {

	private DireccionDAO direccionDao = new DireccionDAO();
	
    private Direccion direccion = new Direccion();

    public void save() {
    	direccionDao.save(direccion);
        direccion = new Direccion();
    }

    public Collection<Direccion> getAllDireccion() {
        return direccionDao.getAll();
    }

    public int saveDireccion(Direccion direccion) {
        validate(direccion);
        return direccionDao.save(direccion);
    }

    private void validate(Direccion direccion) {
        // Details omitted
    }

    public Direccion getDireccion() {
        return direccion;
    }
	
}
