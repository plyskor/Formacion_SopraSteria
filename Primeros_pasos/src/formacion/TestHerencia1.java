package formacion;

import modelo.AlqCasa;
import modelo.Cliente;
import modelo.Pedido;
import negocio.CatalogoPedidos;

public class TestHerencia1 {


	public static void main(String[] args) {
		Pedido p1,p2,p3,p4,p5;
		Cliente cli = new Cliente("A12345","Sopra_Steria",0,0.0);
		//p1=new Pedido("Pedido 1",12.0,cli);
		AlqCasa pcasa1 = new AlqCasa("casa", 1200.0, cli, 80, 3);
		AlqCasa pcasa2 = new AlqCasa("casa2", 1250.0, cli, 100, 4);
		p3 = new AlqCasa("casa malvarosa", 1500.0, cli,250, 7);
	
		//p2 = new Pedido ("grapadora",3.20,cli);
		p4= new AlqCasa("oficina 200 pisos", 45000.0,cli, 4000, 2345);
	//	p5= new Pedido ("roscachapa",1.20,cli);
		CatalogoPedidos c= new CatalogoPedidos();
	//	c.addPedido(p1);
		c.addPedido(pcasa1);
		c.addPedido(pcasa2);
	//	c.addPedido(p2);
		c.addPedido(p3);
		c.addPedido(p4);
	//	c.addPedido(p5);
		c.listarPedidos();
	//	p5.setIdPedido(1);
	//	if(p1.equals(p5))System.out.println("iguales");else System.out.println("distintos");
		pcasa2.setIdPedido(1);
		//if(pcasa2.equals(p1))System.out.println("iguales");else System.out.println("distintos");
		
		
	}

}
