package modelo;

public interface IntGestionEmpleados {
	public void listarEmpleados();

	public boolean addEmpleado(Empleado e);

	public Empleado buscarEmpleado(int index);

	public boolean borrarEmpleado(Empleado e);

	public void borrarTodos();

	public void ordenarEmpelados();

}
