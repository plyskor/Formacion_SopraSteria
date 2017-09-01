package modelo;

public class Trabajo {
	private String idTrabajo;
	private String descTrabajo;
	private double salarioMin;
	private double salarioMax;
	public Trabajo() {
		super();
		idTrabajo=new String();
		descTrabajo=new String();
		salarioMin=0.0;
		salarioMax=0.0;
	}
	
	public Trabajo(String idTrabajo, String descTrabajo, double salarioMin, double salarioMax) {
		super();
		this.idTrabajo = idTrabajo;
		this.descTrabajo = descTrabajo;
		this.salarioMin = salarioMin;
		this.salarioMax = salarioMax;
	}
	@Override
	public String toString() {
		return "Trabajo [idTrabajo=" + idTrabajo + ", descTrabajo=" + descTrabajo + ", salarioMin=" + salarioMin
				+ ", salarioMax=" + salarioMax + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTrabajo == null) ? 0 : idTrabajo.hashCode());
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
		Trabajo other = (Trabajo) obj;
		if (idTrabajo == null) {
			if (other.idTrabajo != null)
				return false;
		} else if (!idTrabajo.equals(other.idTrabajo))
			return false;
		return true;
	}

	public String getIdTrabajo() {
		return idTrabajo;
	}
	public void setIdTrabajo(String idTrabajo) {
		this.idTrabajo = idTrabajo;
	}
	public String getDescTrabajo() {
		return descTrabajo;
	}
	public void setDescTrabajo(String descTrabajo) {
		this.descTrabajo = descTrabajo;
	}
	public double getSalarioMin() {
		return salarioMin;
	}
	public void setSalarioMin(double salarioMin) {
		this.salarioMin = salarioMin;
	}
	public double getSalarioMax() {
		return salarioMax;
	}
	public void setSalarioMax(double salarioMax) {
		this.salarioMax = salarioMax;
	}
	

}
