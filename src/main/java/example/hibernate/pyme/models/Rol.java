package example.hibernate.pyme.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ROL")
@Setter @Getter @NoArgsConstructor
public class Rol implements Serializable{

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;	
	
	@ManyToMany
	@JoinTable(
			name="empleado_rol",
			joinColumns = @JoinColumn(name= "rol_id"),
			inverseJoinColumns = @JoinColumn(name = "empleado_id")
			)
	List<Empleado> empleados;
	
	
}
