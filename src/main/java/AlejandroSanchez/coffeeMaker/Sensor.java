package main.java.AlejandroSanchez.coffeeMaker;

public abstract class Sensor {
	protected int status;
	
	protected int getStatus () {
		return status;
	}
	
	protected void setStatus (int status) {
		this.status = status;
	}
}
/* ON, OFF, getStatus(), setStatus(boolean), on(), off() pueden califica para interfaz en Heater, 
 * talvez en sensores, y en lightindicator. getStatus y setStatus pueden estar en una interfaz y on y off en otra.
 */