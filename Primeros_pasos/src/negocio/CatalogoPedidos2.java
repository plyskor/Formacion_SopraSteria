package negocio;

import modelo.Pedido;

public class CatalogoPedidos2 implements IntCatalogoPedido{

	public CatalogoPedidos2() {
		// TODO Auto-generated constructor stub
	}
	public boolean borrarPedido(Pedido p){
		return false;
	}
	@Override
	public boolean addPedido(Pedido p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void listarPedidos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarPedidos(int posicionRelativa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pedido buscarPedido(int posicionRelativa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int buscarPedido(Pedido p) {
		// TODO Auto-generated method stub
		return 0;
	}

}
