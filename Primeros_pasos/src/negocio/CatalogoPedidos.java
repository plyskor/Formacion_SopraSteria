package negocio;

import modelo.Pedido;

public class CatalogoPedidos {
	private Pedido[] lista;
	private static int cuantosVan = 0;

	public CatalogoPedidos() {
		super();
		this.lista = new Pedido[10];
	}

	public CatalogoPedidos(int tamaño) {
		if (tamaño <= 0)
			return;
		this.lista = new Pedido[tamaño];
	}

	public boolean addPedido(Pedido pedido) {
		if (pedido == null || lista.length == cuantosVan) {
			System.out.println("ERROR: Catálogo Completo");
			return false;
		}
		lista[cuantosVan] = pedido;
		cuantosVan++;
		return true;
	}

	public void listarPedidos() {
		int i=1;
		for (Pedido item : lista) {
			if(item==null)break;
			System.out.println("--------------PEDIDO "+i+"------------------");
			item.mostrarPedido();
			i++;
		}
		return;
	}

	public void listarPedidos(int i) {
		if (i < 0 || i >= lista.length)
			return;
		for (int j = i; j < lista.length; j++) {
			if(lista[j]==null)break;
			System.out.println("--------------PEDIDO "+j+"------------------");
			System.out.println(lista[j]);
		}
		return;
	}

	public Pedido buscarPedido(int posicionRelativa) {
		if (posicionRelativa < 0 || posicionRelativa >= lista.length) {
			System.out.println("ERROR : Fuera de rango");
			return null;
		}
		return lista[posicionRelativa];
	}

	public int buscarPedido(Pedido pedido) {
		if (pedido == null) {
			System.out.println("ERROR : No se puede buscar null");
			return -1;
		}
		int i = 0;
		for (Pedido item : lista) {
			if (item.equals(pedido)) {
				return i;
			}
			i++;
		}
		return -1;
	}

	public boolean eliminarPedido(int posicionRelativa) {
		if (posicionRelativa < 0 || posicionRelativa >= cuantosVan) {
			System.out.println("ERROR : Fuera de rango");
			return false;
		}
		for (int i = posicionRelativa; i < cuantosVan - 1; i++) {
			lista[i] = lista[i + 1];
		}
		lista[cuantosVan - 1] = null;
		cuantosVan--;
		return true;
	}

	public boolean swapPedidos(int posRelativa1, int posRelativa2) {
		if (posRelativa1 < 0 || posRelativa2 < 0 || posRelativa1 >= cuantosVan || posRelativa2 >= cuantosVan
				|| posRelativa1 == posRelativa2) {
			System.out.println("ERROR : Fuera de rango");
			return false;
		}
		Pedido aux = lista[posRelativa1];
		lista[posRelativa1] = lista[posRelativa2];
		lista[posRelativa2] = aux;
		return true;
	}
	
}
