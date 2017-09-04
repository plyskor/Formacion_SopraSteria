package modelo;

public abstract class AbstractContTelefono extends Contacto {
	private static final long serialVersionUID = 4202190674887466360L;
	public AbstractContTelefono(String nombre, String telefono, String email) {
		super(nombre, telefono);
		this.email = new String(email);
	}
	public AbstractContTelefono() {
		super();
	}

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
