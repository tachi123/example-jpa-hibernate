package example.hibernate.pyme.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import example.hibernate.pyme.models.Direccion;

public class DireccionDAO implements DAO<Direccion>{

	private List<Direccion> direccionList = new ArrayList<>();
    
    @Override
    public Optional<Direccion> get(int id) {
        return Optional.ofNullable(direccionList.get(id));
    }

    @Override
    public Collection<Direccion> getAll() {
        return direccionList.stream()
          .filter(Objects::nonNull)
          .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
    }

    @Override
    public int save(Direccion direccion) {
        direccionList.add(direccion);
        int index = direccionList.size() - 1;
        direccion.setId(index);
        return index;
    }

    @Override
    public void update(Direccion direccion) {
        direccionList.set(direccion.getId(), direccion);
    }

    @Override
    public void delete(Direccion direccion) {
        direccionList.set(direccion.getId(), null);
    }
	
}
