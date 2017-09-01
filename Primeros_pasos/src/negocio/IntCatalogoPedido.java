package negocio;
import modelo.Pedido;

public interface IntCatalogoPedido {
	public boolean addPedido(Pedido p);
	public void listarPedidos();
	public void listarPedidos(int posicionRelativa);
	public Pedido buscarPedido(int posicionRelativa);
	public int buscarPedido(Pedido p);
}
