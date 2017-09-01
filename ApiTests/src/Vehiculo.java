

public class Vehiculo implements Comparable<Vehiculo> {
	private static int incr=1;
	private int idVehiculo;
	private String marca;
	private String modelo;
	private String matricula;
	public Vehiculo() {
		super();
		idVehiculo=incr;
		incr++;
		marca=new String();
		modelo= new String();
		matricula = new String();
	}
	
	public Vehiculo(String marca, String modelo, String matricula) {
		super();
		idVehiculo=incr;
		incr++;
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", marca=" + marca + ", modelo=" + modelo + ", matricula="
				+ matricula + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idVehiculo;
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
		Vehiculo other = (Vehiculo) obj;
		if (idVehiculo != other.idVehiculo)
			return false;
		return true;
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	@Override
	public int compareTo(Vehiculo v) {
		return this.getMatricula().compareTo(v.getMatricula());
	}
	

}
