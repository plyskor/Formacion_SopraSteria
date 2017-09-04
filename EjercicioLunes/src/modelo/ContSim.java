package modelo;

import java.io.Serializable;

public class ContSim extends Contacto implements Serializable {
	private static final long serialVersionUID = 4987533337797048566L;
	private String email;
	private String telefonoAdicional;

	public ContSim(String nombre, String telefono, String email, String telefonoAdicional) {
		super(nombre, telefono);
		this.email = new String(email);
		this.telefonoAdicional = new String(telefonoAdicional);
	}

	public ContSim() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefonoAdicional() {
		return telefonoAdicional;
	}

	public void setTelefonoAdicional(String telefonoAdicional) {
		this.telefonoAdicional = telefonoAdicional;
	}

	@Override
	public String toString() {
		return "[Nombre= " + getNombre() + "; Telefono= " + getTelefono() + " Email=" + email + "; TelefonoAdicional= "
				+ telefonoAdicional + " ]";
	}

}
