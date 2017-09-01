package modelo;

public interface IntGestionRRHH<T>{
	public void listar();
	public boolean add(T e);
	public T buscar(int index);
	public boolean borrarUno(T e);
	public boolean borrarUno(int index);
	public void borrarTodos();
	public void ordenar();
}
