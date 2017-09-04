package modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agenda implements IntAgenda {
	private List<Contacto> listin;

	/* Constructor por defecto */
	public Agenda() {
		super();
		listin = new ArrayList<Contacto>();
	}

	public List<Contacto> getListin() {
		return listin;
	}

	@Override
	/* Añade un contacto a la lista (si este no se encuentra alli ya) */
	public boolean addContacto(Contacto c) {
		if (c == null || listin == null) {
			System.out.println("ERROR: se intentó añadir un contacto null");
			return false;
		}
		if (this.buscarContacto(c) != null) {
			System.out.println("ERROR: se intentó añadir un contacto duplicado");
			return false;
		}
		return listin.add(c);
	}

	@Override
	/* Recorre la lista y va sacando los contactos por consola uno tras otro */
	public void listarContactos() {
		int aux = 1;
		if (listin.size() == 0) {
			System.out.println("El listin esta vacio");
			return;
		}
		System.out.println("############LISTIN TELEFONICO#############");
		for (Contacto c : listin) {
			System.out.println("--- C O N T A C T O # " + aux + " --- ");
			System.out.println(c);
			aux++;
		}
		return;
	}

	@Override
	/*
	 * Borra el contacto que se halla en la posicion "index" de la lista y lo
	 * devuelve
	 */
	public Contacto borraContacto(int index) {
		if (index < 0 || index >= listin.size()) {
			System.out.println("ERROR: indice fuera de rango para borrarContacto");
			return null;
		}
		return listin.remove(index);
	}

	@Override
	/*
	 * Borra un contacto de la lista si existe (el que se pasa como argumento) y si
	 * sale bien devuelve true)
	 */
	public boolean borraContacto(Contacto c) {
		if (c == null) {
			System.out.println("ERROR: Contacto se paso como null en borrarContacto");
			return false;
		}
		return listin.remove(c);
	}

	@Override
	/*
	 * Ordena la lista usando el orden alfabético del nombre de contacto (interfaz
	 * Comparable)
	 */
	public void ordenarAgenda() {
		Collections.sort(listin);
		return;
	}

	@Override
	/*
	 * Recorre la lista y saca los objetos (uno a uno) a un fichero (mendiante la
	 * interfaz Serializable)
	 */
	public boolean exportarContactos(String file) throws FileNotFoundException {
		if (file == null) {
			System.out.println("ERROR: no se especifico archivo para exportar contactos.");
			return false;
		}
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
		} catch (IOException e) {
			System.out.println("ERROR: fallo entrada/salida abriendo archivo en exportacion");
			// e.printStackTrace();
			return false;
		}
		for (Contacto c : listin) {
			try {
				oos.writeObject(c);
			} catch (IOException e) {
				System.out.println("ERROR: error I/O al escribir el contacto");
				return false;
				// e.printStackTrace();
			}
		}
		try {
			oos.close();
		} catch (IOException e) {
			System.out.println("ERROR: error I/O al cerrar el filtro");
			return false;
			// e.printStackTrace();
		}
		return false;
	}

	@Override
	/*
	 * Lee del fichero cada objeto (han de ser de la superclase Contacto) y los
	 * añade a la lista uno a uno
	 */
	public void importarContactos(String file) {
		if (file == null) {
			System.out.println("ERROR: no se especifico archivo para importar contactos.");
			return;
		}
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		Contacto c;
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
		} catch (IOException e) {
			System.out.println("ERROR: fallo entrada/salida abriendo archivo en importacion");
			return;
		}
		try {
			while (fis.available() > 0) {
				try {
					c = (Contacto) ois.readObject();
					this.addContacto(c);
				} catch (ClassNotFoundException e) {
					System.out.println("ERROR: conflicto de clases al importar");
					// e.printStackTrace();
					return;
				}
			}
		} catch (IOException e) {
			System.out.println("ERROR: error I/O al leer el contacto");
			// e.printStackTrace();
			return;
		}
		try {
			ois.close();
		} catch (IOException e) {
			System.out.println("ERROR: error I/O al cerrar el filtro");
			// e.printStackTrace();
			return;
		}
	}

	@Override
	/*
	 * Parra modificar se busca el contacto, y si se encuentra se saca de la lista y
	 * se mete el nuevo en el mismo sitio
	 */
	public boolean modificarContacto(Contacto c) {
		if (c == null) {
			System.out.println("ERROR: Contacto a modificar es null");
			return false;
		}
		/* ESTA SERIA LA FORMA FACIL DE HACERLO*/
		/* Contacto aux = this.buscarContacto(c);
		int index = this.getIndex(c);
		if (aux == null) {
			System.out.println("No se puede modificar el contacto porque no existe");
			return false;
		}
		listin.add(index, c);
		*/
		Contacto aux = this.buscarContacto(c);
		int a = getIndex(c);
		Contacto nuevo = null;
		if (aux == null) {
			System.out.println("No se puede modificar el contacto porque no existe");
			return false;
		}
		if(c instanceof Contacto) {
				/*Los dos son contactos!!*/
				aux=new Contacto(c.getNombre(),c.getTelefono());
				listin.set(a, aux);
		}
		if(c instanceof ContSim) {
			aux=new ContSim(c.getNombre(),c.getTelefono(),((ContSim) c).getEmail(),((ContSim) c).getEmail());
			listin.set(a, aux);
		}
		if(c instanceof ContactoPersonal) {
			aux = new ContactoPersonal(c.getNombre(),c.getTelefono(),((ContactoPersonal) c).getEmail(),((ContactoPersonal) c).getTelefonoCasa());
			listin.set(a, aux);
		}
		if(c instanceof ContactoProfesional) {
			aux = new ContactoProfesional(c.getNombre(), c.getTelefono(), ((ContactoProfesional) c).getEmail(), ((ContactoProfesional) c).getTelefonoOficina(), ((ContactoProfesional) c).getDireccion(), ((ContactoProfesional) c).getCorreoEmpresa());
			listin.set(a, aux);
		}
		return true;
	}

	/* METODOS AUXILIARES, CREADOS COMO APOYO PARA LOS METODOS QUE SE PEDIAN */
	/* Busca un contacto por nombre y lo devuelve */
	public Contacto buscarContacto(Contacto c) {
		if (c == null) {
			return null;
		}
		for (Contacto ele : listin) {
			if (ele.equals(c)) {
				int a=getIndex(ele);
				return listin.get(a);
			}
		}
		return null;
	}

	/*
	 * Busca un contacto por nombre y devuelve el indice de la lista donde se halla
	 */
	public int getIndex(Contacto c) {
		if (c == null) {
			System.out.println("ERROR: no se puede obtener indice de contacto a null");
			return -1;
		}
		int ret = 0;
		for (Contacto ele : listin) {
			if (ele.equals(c)) {
				return ret;
			}
			ret++;
		}
		return -1;
	}

}
