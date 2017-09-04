package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agenda implements IntAgenda {
private List<Contacto> listin;
	public Agenda() {
	super();
	listin=new ArrayList<Contacto>();
}

	public List<Contacto> getListin() {
		return listin;
	}

	@Override
	public boolean addContacto(Contacto c) {
		if(c==null||listin==null) {
			System.out.println("ERROR: se intentó añadir un contacto null");
			return false;
		}
		if(this.buscarContacto(c)!=null) {
			System.out.println("ERROR: se intentó añadir un contacto duplicado");
			return false;
		}
		return listin.add(c);
	}

	@Override
	public void listarContactos() {
		int aux=1;
		if(listin.size()==0) {
			System.out.println("El listin esta vacio");
			return;
		}
		System.out.println("############LISTIN TELEFONICO#############");
		for(Contacto c: listin) {
		System.out.println("--- C O N T A C T O # "+ aux +" --- ");
		System.out.println(c);
		aux++;
		}
		return;
	}

	@Override
	public Contacto borraContacto(int index) {
		if(index<0||index>=listin.size()) {
			System.out.println("ERROR: indice fuera de rango para borrarContacto");
			return null;
		}
		return listin.remove(index);
	}

	@Override
	public boolean borraContacto(Contacto c) {
		if(c==null) {
			System.out.println("ERROR: Contacto se paso como null en borrarContacto");
			return false;
		}
		return listin.remove(c);
	}

	@Override
	public void ordenarAgenda() {
		Collections.sort(listin);
		return;
	}

	@Override
	public boolean exportarContactos(String file) {
		if(file==null) {
			System.out.println("ERROR: no se especifico archivo para exportar contactos.");
			return false;
		}
		ObjectOutputStream oos = null;
		try {
			oos= new ObjectOutputStream(new FileOutputStream(file));
		} catch (IOException e) {
			System.out.println("ERROR: fallo entrada/salida abriendo archivo en exportacion");
			e.printStackTrace();
			return false;
		}
		for(Contacto c:listin) {
			try {
				oos.writeObject(c);
			} catch (IOException e) {
				System.out.println("ERROR: error I/O al escribir el contacto");
				e.printStackTrace();
			}
			}try {
				oos.close();
			} catch (IOException e) {
				System.out.println("ERROR: error I/O al cerrar el filtro");
				e.printStackTrace();
			}
		return false;
	}

	@Override
	public void importarContactos(String file) {
		if(file==null) {
			System.out.println("ERROR: no se especifico archivo para importar contactos.");
			return;
		}
		ObjectInputStream ois=null;
		FileInputStream fis=null;
		Contacto c;
		try {
			fis=new FileInputStream(file);
			ois= new ObjectInputStream(fis);
		} catch (IOException e) {
			System.out.println("ERROR: fallo entrada/salida abriendo archivo en importacion");
			e.printStackTrace();
		}
		try {
			while( fis.available() > 0) {
				try {
					c=(Contacto) ois.readObject();
					listin.add(c);
				} catch (ClassNotFoundException e) {
					System.out.println("ERROR: conflicto de clases al importar");
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			System.out.println("ERROR: error I/O al leer el contacto");
			e.printStackTrace();
		}
	}

	@Override
	public boolean modificarContacto(Contacto c) {
		if(c==null) {
			System.out.println("ERROR: Contacto a modificar es null");
			return false;
		}
		Contacto aux=this.buscarContacto(c);
		int index=this.getIndex(c);
		if(aux==null) {
			System.out.println("No se puede modificar el contacto porque no existe");
			return false;
		}
		listin.add(index, c);
		return false;
	}
	public Contacto buscarContacto(Contacto c) {
		if(c==null) {
			return null;
		}
		for(Contacto ele:listin) {
			if (ele.equals(c)) {
				return ele;
			}
		}return null;
	}
	public int getIndex(Contacto c) {
		if(c==null) {
			System.out.println("ERROR: no se puede obtener indice de contacto a null");
			return -1;
		}
		int ret=0;
		for(Contacto ele:listin) {
			if (ele.equals(c)){
				return ret;
			}
			ret++;
		}
		return -1;
	}

}
