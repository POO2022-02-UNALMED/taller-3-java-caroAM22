package taller3.televisores;

public class TV {
	Marca marca;
	int canal;
	private int precio;
	boolean estado;
	int volumen;
	Control control;
	static int numTV;
	
	public TV(Marca marca,boolean estado) {
		this.marca=marca;
		this.estado=estado;
		this.canal=1;
		this.volumen=1;
		this.precio=500;
		TV.numTV+=1;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca=marca;
	}

	public Control getControl() {
		return control;
	}
	
	public void setControl(Control control) {
		this.control=control;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	public int getVolumen() {
		return volumen;
	}
	
	public void setVolumen(int volumen) {
		this.volumen=volumen;
	}
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int canal) {
		if (estado!=true || canal>120 || canal<1) {
			return;
		}
		this.canal=canal;
	}
	
	public int getNumTV() {
		return numTV;
	}
	
	public void setNumTV(int numTV) {
		TV.numTV=numTV;
	}
	
	
	public void turnOn() {
		this.estado=true;
	}
	public void turnOff() {
		this.estado=false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if (estado!=true || canal==120) {
			return;
		}
		canal++;
	}
	
	public void canalDown() {
		if (estado!=true || canal==0) {
			return;
		}
		canal--;
	}
	public void volumenUp() {
		if (estado!=true || volumen==7) {
			return;
		}
		volumen++;
	}
	
	public void volumenDown() {
		if (estado!=true || volumen==0) {
			return;
		}
		volumen--;
	}
}
