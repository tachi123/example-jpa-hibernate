package example.hibernate.pyme.services;

import java.util.List;

import javax.transaction.Transactional;

import example.hibernate.pyme.DAO.EmpleadoDAO;
import example.hibernate.pyme.models.Empleado;

public class EmpleadoService {

    private EmpleadoDAO dao = new EmpleadoDAO();

    public void create(Empleado entity) {
        dao.create(entity);
    }

    public Empleado findOne(int id) {
        return dao.findOne(id);
    }

    public List<Empleado> findAll() {
        return dao.findAll();
    }
	
}
