package negocio;
import modelo.*;
public class TestRRHH {
	public static void main(String[] args) {
		Trabajo trabajo,t2,t3,t4,t5;
		Vehiculo vehiculo;
		Empleado e1,e2,e3,e4,e5,lista[];
		Departamento d1,d2;
		trabajo = new Trabajo("I.T PROG", "Analista Programador Sistemas de Informacion", 20000, 40000);
		t2= new Trabajo("Recursos Humanos", "Recruiter", 18000, 45000);
		t3= new Trabajo("Director Ejecutivo", "Director de operaciones", 40000, 100000);
		t4=new Trabajo("Comunity Manager", "Uso RRSS de la empresa", 15000, 20000);
		t5=new Trabajo("Conserjeria", "Conserje del departamento de IT", 10000, 12000);
		vehiculo=new Vehiculo("Peugeot", "206+", "0123ABC");
		d1= new Departamento();
		d2=new Departamento();
		e1=new Gerente(125, "+34618202981", 1500, "Pepe", 35000, trabajo, d1);
		e2= new Empleado("Sara", 29000, t2, d2);
		e3=new Director(25, vehiculo, 128, "Juan", 45000, t3, d1);
		e4= new Empleado("Gonzalo", 30000, t4, d2);
		e5= new Empleado("Eusebio", 12000, t5, d1);
		lista=new Empleado[5];
		lista[0]=e1;
		lista[1]=e3;
		d1.setMisEmpleados(lista);
		d1.incrEmpleados();
		d1.incrEmpleados();
		lista[0]=e2;
		lista[1]=e4;
		d2.incrEmpleados();
		d2.incrEmpleados();
		d2.setMisEmpleados(lista);
		d1.setDescDep("Departamento IT");
		d1.setJefeDep(e1);
		d1.addEmpleado(e5);
		d2.setDescDep("Departamento RRHH");
		d2.setJefeDep(e2);
		System.out.println("############DEPARTAMENTO 1 (LISTA DE EMPLEADOS)##############");
		d1.listarEmpleados();
		System.out.println("############DEPARTAMENTO 2 (LISTA DE EMPLEADOS)##############");
		d2.listarEmpleados();
		System.out.println("EMPLEADO BUSCADO:");
		System.out.println(d1.buscarEmpleado(3));
		}
}
