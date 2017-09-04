package test;

import modelo.*;

public class TestAgenda {

	public static void main(String[] args) {
		Agenda a = new Agenda();
	 Contacto c1,c2,c3,c4;
		
		  c1= new Contacto("jose", "618202981"); 
		  c2= new ContSim("sara", "618718132","sara.riop@gmail.com", "969690302"); 
		  c3= new ContactoPersonal("juanra","676128990", "juanramonillanrubio@gmail.com", "910585731"); 
		  c4= new ContactoProfesional("gonzalo", "633693673", "gonalo.ao.1992@gmail.com", "914268851", "Calle Puebla de Sanabria 29, I", "gonzalo.arroyo@gmail.com");
		  a.addContacto(c1); 
		  a.addContacto(c2); 
		  a.addContacto(c3);
		  a.addContacto(c4);
		  a.listarContactos(); 
		  c4= new Contacto("juanra", "633693673");
		  a.ordenarAgenda(); 
		  a.modificarContacto(c4); 
		  a.listarContactos();
		  a.exportarContactos("agenda.data");
		  a.importarContactos("dos.data");
		  a.listarContactos();
	}

}
