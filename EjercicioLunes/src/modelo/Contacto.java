package modelo;

import java.io.Serializable;

public class Contacto implements Comparable<Contacto>, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2636888721453390410L;
	private String nombre;
	private String telefono;
	public Contacto(String nombre, String telefono) {
		super();
		this.nombre = new String(nombre);
		this.telefono = new String(telefono);
	}
	public Contacto() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "[Nombre= " + nombre + "; Telefono= " + telefono + " ]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		/*if (getClass() != obj.getClass())
			return false; SOLO SON IGUALES SI SE REPITE EL NOMBRE DA IGUAL LA CLASE*/
		Contacto other = (Contacto) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Contacto c) {
		if(c==null) {
			System.out.println("ERROR: Comparando un contacto a null");
			return 0;
		}
		return this.getNombre().compareTo(c.getNombre());
	}
	
}
