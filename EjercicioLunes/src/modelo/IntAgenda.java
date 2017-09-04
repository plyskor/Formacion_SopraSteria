package modelo;

import java.io.FileNotFoundException;

public interface IntAgenda {
	public boolean addContacto(Contacto c);

	public void listarContactos();

	public Contacto borraContacto(int index);

	public boolean borraContacto(Contacto c);

	public void ordenarAgenda();

	public boolean exportarContactos(String file) throws FileNotFoundException;

	public void importarContactos(String file);

	public boolean modificarContacto(Contacto c);
}
