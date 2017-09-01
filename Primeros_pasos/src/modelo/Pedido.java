package modelo;

public abstract class Pedido {
	private static int indexAux=0;
	private int idPedido;
	protected String descPedido;
	private double importe;
	private Cliente cliente;

	public Pedido() {
		super();
		indexAux++;
		idPedido=indexAux;
		descPedido="";
		cliente=new Cliente();
	}
	public Pedido( String descPedido) {
		super();
		indexAux++;
		idPedido=indexAux;
		this.descPedido = descPedido;
	}
	public Pedido( String descPedido, double importe, Cliente cliente) {
		super();
		indexAux++;
		idPedido=indexAux;
		this.descPedido = descPedido;
		this.importe = importe;
		this.cliente = cliente;
	}
	public Pedido( String descPedido, double importe) {
		super();
		
		this.descPedido = descPedido;
		this.importe = importe;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public String getDescPedido() {
		return descPedido;
	}
	public void setDescPedido(String descPedido) {
		this.descPedido = descPedido;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	@Override
	public String toString() {
		return "Pedido ID = " + idPedido + ", Descripcion = " + descPedido + ", Importe = " + importe + " Cliente CIF : "+cliente.getCif()+" ";
	}
	public Pedido(Cliente cliente) {
		super();
		indexAux++;
		idPedido=indexAux;
		this.cliente = cliente;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPedido;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (idPedido != other.idPedido)
			return false;
		return true;
	}
	
	public double importeTotal(int IVA){
		return this.importe+(this.importe*IVA/100);
	}
	public abstract void mostrarPedido();
}
