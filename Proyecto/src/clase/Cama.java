package clase;
public class Cama {
	private int ncama,categoria,estado;
	private double precio;
	public Cama (int nc,int cat,double pre, int est){
		this.ncama=nc;
		this.categoria=cat;
		this.estado=est;
		this.precio=pre;
	}
	public int getNcama() {
		return ncama;
	}
	public void setNcama(int ncama) {
		this.ncama = ncama;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	//elegimos las opciones para categoria
	public String detalleCategoria(){
		switch(categoria){
		
		//�Por qu� sin break ? Argumentar.
		case 0: return "basico";
		case 1: return "estandar";
		default: return "premium";
		}	
	}
	//elegimos las opciones para estado
	public String detalleEstado(){
		switch(estado){
		case 0: return "libre";
		default: return "ocupado";
		}
	}
	
	
	
}
