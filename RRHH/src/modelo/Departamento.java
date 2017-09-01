package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Departamento implements IntGestionEmpleados{
	private final static short MAX_EMPLEADOS=10;
	private static int incr=1;
	private int idDep;
	private String descDep;
	private Empleado jefeDep;
	private List<Empleado> misEmpleados;
	public Departamento(String descDep, Empleado jefeDep, Empleado[] lista) {
		if(descDep==null||jefeDep==null||lista==null){
			System.out.println("ERROR: Constructor departamento recibió null");
			return;
		}
		idDep=incr;
		incr++;
		this.descDep=descDep;
		this.jefeDep=jefeDep;
		misEmpleados=new ArrayList<Empleado>();
	}
	
	public Departamento() {
		super();
		idDep=incr;
		incr++;
		descDep=new String();
		jefeDep=null;
		misEmpleados=new ArrayList<Empleado>();
	}
	
	/*public boolean addEmpleado(Empleado empleado){
		if(empleado==null||misEmpleados.size()==MAX_EMPLEADOS){
			System.out.println("ERROR: No se pudo añadir el empleado al departamento.");
			return false;
		}
		this.misEmpleados[misEmpleados.size()]=empleado;
		misEmpleados.size()++;
		return true;
	}
	public void listarEmpleados(){
		if (misEmpleados.size()==0){
			System.out.println("No hay empleados en este departamento");
			return;
		}
		for(Empleado e:misEmpleados){
			if(e==null)
				break;
			System.out.println("---EMPLEADO "+e.getIdEmpleado()+"---");
			System.out.println(e);
		}
		return;
	}
	public Empleado buscarEmpleado(int idEmpleado){
		if(idEmpleado<=0){
			System.out.println("ERROR: No se pueden buscar empleados con ID <= 0");
			return null;
		}
		for(Empleado e:misEmpleados){
			if(e==null)break;
			if(e.getIdEmpleado()==idEmpleado)
				return e;
		}
		System.out.println("No se ha encontrado el empleado.");
		return null;
		
	}*/
	public List<Empleado> getMisEmpleados() {
		return misEmpleados;
	}
	public void setMisEmpleados(ArrayList<Empleado> misEmpleados) {
		if(misEmpleados==null){
			System.out.println("ERROR: Se ha pasado la lista como null en setMisEmpleados");
			return;
		}
		this.misEmpleados=misEmpleados;
		return;
	}
	public int getIdDep() {
		return idDep;
	}
	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}
	public String getDescDep() {
		return descDep;
	}
	public void setDescDep(String descDep) {
		this.descDep = descDep;
	}
	public Empleado getJefeDep() {
		return jefeDep;
	}
	public void setJefeDep(Empleado jefeDep) {
		this.jefeDep = jefeDep;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idDep;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		if (idDep != other.idDep)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Departamento [idDep=" + idDep + ", descDep=" + descDep + ", jefeDep=" + jefeDep.getNombre() 
				 + "]";
	}
	@Override
	public void listarEmpleados() {
		if (misEmpleados.size()==0){
			System.out.println("No hay empleados en este departamento");
			return;
		}
		for(Empleado e:misEmpleados){
			if(e==null)
				break;
			System.out.println("---EMPLEADO "+e.getIdEmpleado()+"---");
			System.out.println(e);
		}
		return;	
	}

	@Override
	public boolean addEmpleado(Empleado e) {
		if(e==null||misEmpleados.size()==MAX_EMPLEADOS){
			System.out.println("ERROR: No se pudo añadir el empleado al departamento.");
			return false;
		}
		if(!misEmpleados.contains(e)){
			this.misEmpleados.add(e);
		}
		return true;
		
	}

	@Override
	public Empleado buscarEmpleado(int index) {
		if(index<=0){
			System.out.println("ERROR: No se pueden buscar empleados con ID <= 0");
			return null;
		}
		return misEmpleados.get(index);
	}

	@Override
	public boolean borrarEmpleado(Empleado e) {
		if (e==null) {
			System.out.println("ERROR : Nada que eliminar");
			return false;
		}
		return misEmpleados.remove(e);
		
	}

	@Override
	public void borrarTodos() {
		misEmpleados.clear();
		return;
	}
	@Override
	public void ordenarEmpelados() {
		Collections.sort(misEmpleados);
	}
}
