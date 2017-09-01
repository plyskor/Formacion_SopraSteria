package modelo;

public class Cliente {
	private String cif, razonSocial;
	private int numEmpleados;
	private double facturacionAnual;
	/* CONSTRUCTORS*/
	public Cliente(String cif, String razonSocial, int numEmpleados, double facturacionAnual) {
		super();
		this.cif = cif;
		this.razonSocial = razonSocial;
		this.numEmpleados = numEmpleados;
		this.facturacionAnual = facturacionAnual;
	}
	public Cliente() {
		super();
		cif="";
		razonSocial="";
	}
	/* GETTERS AND SETTERS*/
	public String getCif() {
		if(cif==null)return "";
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public int getNumEmpleados() {
		return numEmpleados;
	}
	public void setNumEmpleados(int numEmpleados) {
		this.numEmpleados = numEmpleados;
	}
	public double getFacturacionAnual() {
		return facturacionAnual;
	}
	public void setFacturacionAnual(double facturacionAnual) {
		this.facturacionAnual = facturacionAnual;
	}
	/* OTHER METHODS*/
	@Override
	public String toString() {
		return "cif=" + cif + ", razonSocial=" + razonSocial + ", numEmpleados=" + numEmpleados
				+ ", facturacionAnual=" + facturacionAnual;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cif == null) ? 0 : cif.hashCode());
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
		Cliente other = (Cliente) obj;
		if (cif == null) {
			if (other.cif != null)
				return false;
		} else if (!cif.equals(other.cif))
			return false;
		return true;
	}
	
	
	
	
}
