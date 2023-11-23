package example.hibernate.pyme.models;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="DIRECCION")
@Setter @Getter @NoArgsConstructor
public class Direccion implements Serializable{

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToOne(mappedBy="direccionLaboral")
	private Empleado empleado;
	
	@Column(name="calle")
	private String calle;
	
	@Column(name="localidad")
	private String localidad;
		
}