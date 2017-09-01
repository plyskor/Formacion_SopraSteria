package modelo;

public class AlqCasa extends Pedido {
	private int metrosCuadrados, numHabitaciones;
	public AlqCasa() {
		// TODO Auto-generated constructor stub
	}

	public AlqCasa(String descPedido) {
		super(descPedido);
		// TODO Auto-generated constructor stub
	}

	public AlqCasa(String descPedido, double importe, Cliente cliente,int metros, int habs) {
		super(descPedido, importe, cliente);
		this.metrosCuadrados=metros;
		this.numHabitaciones=habs;
		// TODO Auto-generated constructor stub
	}

	public AlqCasa(String descPedido, double importe,int metros, int habs) {
		super(descPedido, importe);
		this.metrosCuadrados=metros;
		this.numHabitaciones=habs;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\tmetros: "+metrosCuadrados+"\thabs: "+numHabitaciones+" \n";
	}

	public AlqCasa(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numHabitaciones;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlqCasa other = (AlqCasa) obj;
		if (getIdPedido() != other.getIdPedido())
			return false;
		return true;
	}

	@Override
	public void mostrarPedido() {
		System.out.println("idPedido = "+this.getIdPedido());
		System.out.println("importe = "+this.getImporte());
		System.out.println("descPedido = "+descPedido);
		System.out.println("metrosCuadrados = "+this.metrosCuadrados);
		System.out.println("numHabitaciones = "+this.numHabitaciones);
	}

}
