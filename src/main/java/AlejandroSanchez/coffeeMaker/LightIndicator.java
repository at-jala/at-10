package main.java.AlejandroSanchez.coffeeMaker;

public class LightIndicator {
	final boolean OFF = false; 
	final boolean ON = true; 
	boolean status;
	
	LightIndicator() {
		status = false;
	}
	
	boolean getStatus () {
		return status;
	}
	
	void setStatus (boolean status) {
		this.status = status;
	}

	void off() {
		status = OFF;
	}
	
	void on() {
		status = ON;
	}
}
/* ON, OFF, getStatus(), setStatus(boolean), on(), off() pueden califica para interfaz en Heater, 
 * talvez en sensores, y en lightindicator. getStatus y setStatus pueden estar en una interfaz y on y off en otra.
 */