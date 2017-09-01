/*
package formacion;

import modelo.Cliente;
import modelo.Pedido;
import negocio.CatalogoPedidos;

public class TestCatalogo {
	public static void main(String[] args) {
	Pedido p1,p2,p3;
	Cliente cli = new Cliente("A12345","Sopra_Steria",0,0.0);
	p1=new Pedido("Pedido 1",0.0,cli);
	p1.setImporte(10.0);
	System.out.println(p1);
	p2 = new Pedido(cli);
	System.out.println(p2);
	p3=new Pedido(cli);
	p3.setIdPedido(3);
	p3.setDescPedido("Pedido 3");
	p3.setImporte(2.5);
	System.out.println(p3);
	//Pedido p4= new Pedido("Pedido 1",0,cli);
	p4.setImporte(7.2);
	Cliente cl1=new Cliente();
	if(!p1.equals(cl1))
		System.out.println("Distintos p1 y c1");
	if(p1.equals(p4))
	System.out.println("Los pedidos 1 y 4 son iguales");
	else
		System.out.println("Los pedidos 1 y 4 son distintos");
	System.out.println("El pedido 1 con 21% de IVA cuesta "+p1.importeTotal(21));
	System.out.println("Hola");
	
	/*PRUEBAS CATÁLOGO PEDIDOS*//*
	CatalogoPedidos c1 = new CatalogoPedidos(20);
	CatalogoPedidos c2 = new CatalogoPedidos();
	c1.addPedido(p1);
	c1.addPedido(p2);
	c1.addPedido(p3);
	c1.addPedido(p4);
	for(int i=0;i<16;i++){
		c1.addPedido(p1);
	}
	System.out.println(c1.buscarPedido(2));
	System.out.println(c1.buscarPedido(c1.buscarPedido(p3)));
	c1.listarPedidos();
	System.out.println("--------------------------------------BORRADO---------------------------------");
	c1.eliminarPedido(19);
	c1.listarPedidos();
	c1.addPedido(new Pedido());
	c1.listarPedidos(19);
	System.out.println("--------------------------------------CAT2---------------------------------");
	c2.listarPedidos();

}}
*/