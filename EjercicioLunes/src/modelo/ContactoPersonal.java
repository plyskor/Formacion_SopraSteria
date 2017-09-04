package modelo;

import java.io.Serializable;

public class ContactoPersonal extends AbstractContTelefono implements Serializable {
	private static final long serialVersionUID = 4671657328182848938L;
	private String telefonoCasa;

	public ContactoPersonal(String nombre, String telefono, String email, String telefonoCasa) {
		super(nombre, telefono, email);
		this.telefonoCasa = new String(telefonoCasa);
	}

	public ContactoPersonal() {
		super();
	}

	public String getTelefonoCasa() {
		return telefonoCasa;
	}

	public void setTelefonoCasa(String telefonoCasa) {
		this.telefonoCasa = telefonoCasa;
	}

	@Override
	public String toString() {
		return "[Nombre= " + getNombre() + "; Telefono= " + getTelefono() + " TelefonoCasa= " + telefonoCasa + "]";
	}

	@Override
	public boolean cambiarContacto(AbstractContTelefono c) {
		if(c==null) {
			System.out.println("ERROR: No se puede cambiar un contacto a un null");
			return false;
		}
		this.setNombre(c.getNombre());
		this.setTelefono(c.getTelefono());
		this.setEmail(c.getEmail());
		this.setTelefonoCasa(((ContactoPersonal) c).getTelefonoCasa());
		return true;
	}

}
