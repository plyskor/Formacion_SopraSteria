package modelo;

import java.io.Serializable;

public class ContactoProfesional extends AbstractContTelefono implements Serializable{
private static final long serialVersionUID = 1105000557191099238L;
private String telefonoOficina;
private String direccion;
private String correoEmpresa;
public ContactoProfesional(String nombre, String telefono, String email, String telefonoOficina, String direccion,
		String correoEmpresa) {
	super(nombre, telefono, email);
	this.telefonoOficina = new String(telefonoOficina);
	this.direccion = new String(direccion);
	this.correoEmpresa = new String(correoEmpresa);
}
public ContactoProfesional() {
	super();
}
public String getTelefonoOficina() {
	return telefonoOficina;
}
public void setTelefonoOficina(String telefonoOficina) {
	this.telefonoOficina = telefonoOficina;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getCorreoEmpresa() {
	return correoEmpresa;
}
public void setCorreoEmpresa(String correoEmpresa) {
	this.correoEmpresa = correoEmpresa;
}
@Override
public String toString() {
	return "[Nombre= " + getNombre() + "; Telefono= " + getTelefono() +" TelefonoOficina= " + telefonoOficina + "; Direccion= " + direccion + "; CorreoEmpresa= "
			+ correoEmpresa + " ]";
}

}
