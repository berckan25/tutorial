package tutorialesMaven;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblcliente database table.
 * 
 */
@Entity
@NamedQuery(name="Tblcliente.findAll", query="SELECT t FROM Tblcliente t")
public class Tblcliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcliente;

	private String apellidocliente;

	private String dni;

	private String nombrecliente;

	private String telefono;

	public Tblcliente() {
	}

	public int getIdcliente() {
		return this.idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getApellidocliente() {
		return this.apellidocliente;
	}

	public void setApellidocliente(String apellidocliente) {
		this.apellidocliente = apellidocliente;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombrecliente() {
		return this.nombrecliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}