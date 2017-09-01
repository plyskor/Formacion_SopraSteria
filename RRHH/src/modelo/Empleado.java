package modelo;

public class Empleado implements Comparable<Empleado> {
	private int idEmpleado;
	private static int incr=1;
	private String nombre;
	private double salario;
	private Trabajo trabajo;
	private Departamento departamento;
	public Empleado() {
		super();
		this.idEmpleado = incr;
		incr++;
		this.nombre = new String();
		this.salario = 0.0;
		this.trabajo =null;
		this.departamento = null;
	}
	public Empleado(String nombre, double salario, Trabajo trabajo, Departamento departamento) {
		super();
		this.idEmpleado = incr;
		incr++;
		this.nombre = nombre;
		this.salario = salario;
		this.trabajo = trabajo;
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", salario=" + salario + ", trabajo="
				+ trabajo + ", departamento=" + departamento + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEmpleado;
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
		Empleado other = (Empleado) obj;
		if (idEmpleado != other.idEmpleado)
			return false;
		return true;
	}
	public double calcularSalarioTotal(){
		return salario;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Trabajo getTrabajo() {
		return trabajo;
	}
	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	@Override
	public int compareTo(Empleado arg0) {
		
		return this.getNombre().compareTo(arg0.getNombre());
	}
	

}
