package example.hibernate.pyme.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="EMPLEADO")
@Setter @Getter @NoArgsConstructor
public class Empleado implements Serializable{
	
	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 8438118305668394283L;

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nombre",length=80,nullable=false)
	private String nombre;
	
	@OneToOne
	@JoinColumn(name="direccion_id", referencedColumnName="id")
	private Direccion direccionLaboral;
	
	@ManyToOne
	@JoinColumn(name="sector_id", referencedColumnName="id")
	private Sector sector;
	
	@ManyToMany(mappedBy="empleados")
	private List<Rol> roles;
	
	public Empleado(String nombre) {
		this.setNombre(nombre);
	}
	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Empleado other = (Empleado) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Empleado [name=").append(nombre).append("]");
        return builder.toString();
    }
	
}

