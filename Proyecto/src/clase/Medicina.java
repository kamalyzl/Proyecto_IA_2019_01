package clase;

public class Medicina {

	private int codigoMedicina, stock;
	private String nombre, laboratorio;
	private double precioUnitario;

	public Medicina(int codigoMedicina, String nombre, String laboratorio, double precioUnitario, int stock) {
		this.codigoMedicina = codigoMedicina;
		this.stock = stock;
		this.nombre = nombre;
		this.laboratorio = laboratorio;
		this.precioUnitario = precioUnitario;

	}

	public int getCodigoMedicina() {
		return codigoMedicina;
	}

	public void setCodigoMedicina(int codigoMedicina) {
		this.codigoMedicina = codigoMedicina;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

}
