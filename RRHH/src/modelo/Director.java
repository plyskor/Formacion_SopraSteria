package modelo;

public class Director extends Empleado {
	private int acciones;
	private Vehiculo vehiculo;
	private int plazaGaraje;
	public Director() {
		super();
		acciones=0;
		vehiculo= new Vehiculo();
		plazaGaraje=0;
	}
	public Director(int acciones, Vehiculo vehiculo, int plazaGaraje,String nombre, double salario, Trabajo trabajo, Departamento departamento) {
		super(nombre,salario,trabajo,departamento);
		this.acciones = acciones;
		this.vehiculo = vehiculo;
		this.plazaGaraje = plazaGaraje;
	}
	@Override
	public String toString() {
		return "Director "
				+ "[idEmpleado= " + this.getIdEmpleado() + ", nombre= " + this.getNombre() + ", salario= " + this.getSalario() + ", trabajo="
				+ this.getTrabajo() + ", departamento= " + this.getDepartamento() + "acciones= " + acciones + ", vehiculo= " + vehiculo + ", plazaGaraje= " + plazaGaraje + "]";
	}
	public int getAcciones() {
		return acciones;
	}
	public void setAcciones(int acciones) {
		this.acciones = acciones;
	}
	public double calcularSalarioTotal(double valorAccion) {
		return super.calcularSalarioTotal()+acciones*valorAccion;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public int getPlazaGaraje() {
		return plazaGaraje;
	}
	public void setPlazaGaraje(int plazaGaraje) {
		this.plazaGaraje = plazaGaraje;
	}
	
}
