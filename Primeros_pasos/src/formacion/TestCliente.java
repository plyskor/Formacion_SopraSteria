package formacion;

import modelo.Cliente;

public class TestCliente {

	public static void main(String[] args) {
		Cliente cli1,cli2;
		cli1=new Cliente("A12346","Sopra_Steria",0,0.0);
		//cli1.setCif("A12345");
		//cli1.setRazonSocial("Sopra_Steria");
		cli2 = new Cliente("A12345","Sopra_Steria",0,0.0);
		System.out.println("cif : " + cli1.getCif());
		System.out.println("numero empleados : "+cli1.getNumEmpleados());
		System.out.println("Cliente : "+ cli1);
		System.out.println("Cliente : "+ cli2);
		System.out.println(cli1.equals(cli2));
		
	}


}
