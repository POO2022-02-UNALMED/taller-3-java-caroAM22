package taller3.televisores;

public class Control {
	TV tv;
	
	public void enlazar(TV tv) {
		this.tv=tv;
		tv.control=this;
	}
	
	public TV getTV() {
		return tv;
	}
	
	public void setTV(TV tv) {
		this.tv=tv;
	}

	public void canalUp() {
		if (tv.estado!=true || tv.canal==120) {
			return;
		}
		tv.canal++;
	}
	
	public void canalDown() {
		if (tv.estado!=true || tv.canal==0) {
			return;
		}
		tv.canal--;
	}
	public void volumenUp() {
		if (tv.estado!=true || tv.volumen==7) {
			return;
		}
		tv.volumen++;
	}
	
	public void volumenDown() {
		if (tv.estado!=true || tv.volumen==0) {
			return;
		}
		tv.volumen--;
	}
	
	public void setCanal(int canal) {
		if (tv.estado!=true || tv.canal>120 || tv.canal<1) {
			return;
		}
		tv.canal=canal;
	}
	
	public void turnOn() {
		tv.estado=true;
	}
	
	public void turnOff() {
		tv.estado=false;
	}
	
}
