package modelo;

public class Gerente extends Empleado {
	private int plazaGaraje;
	private String movilEmpresa;
	private double variable;
	public Gerente() {
		super();
		plazaGaraje=0;
		movilEmpresa=new String();
		variable=0.0;
	}
	
	public Gerente(int plazaGaraje, String movilEmpresa, double variable,String nombre, double salario, Trabajo trabajo, Departamento departamento) {
		super(nombre,salario,trabajo,departamento);
		this.plazaGaraje = plazaGaraje;
		this.movilEmpresa = movilEmpresa;
		this.variable = variable;
	}

	@Override
	public String toString() {
		return "Gerente [idEmpleado= " + this.getIdEmpleado() + ", nombre= " + this.getNombre() + ", salario= " + this.getSalario() + ", trabajo="
				+ this.getTrabajo() + ", departamento= " + this.getDepartamento()+" plazaGaraje= " + plazaGaraje + ", movilEmpresa= " + movilEmpresa + ", variable= " + variable
				+ "]";
	}

	public int getPlazaGaraje() {
		return plazaGaraje;
	}
	public void setPlazaGaraje(int plazaGaraje) {
		this.plazaGaraje = plazaGaraje;
	}
	public String getMovilEmpresa() {
		return movilEmpresa;
	}
	public void setMovilEmpresa(String movilEmpresa) {
		this.movilEmpresa = movilEmpresa;
	}
	public double getVariable() {
		return variable;
	}
	
	@Override
	public double calcularSalarioTotal() {
		return super.calcularSalarioTotal()+variable;
	}

	public void setVariable(double variable) {
		this.variable = variable;
	}
	

}
