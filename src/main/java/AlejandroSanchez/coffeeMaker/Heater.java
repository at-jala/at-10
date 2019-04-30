package main.java.AlejandroSanchez.coffeeMaker;

public class Heater implements Drive {
	final boolean OFF = false; 
	final boolean ON = true; 
	boolean status;
	Sensor sensor;
	
	Heater () {
		status = OFF;
	}
	
	boolean getStatus () {
		return status;
	}
	
	void setStatus (boolean status) {
		this.status = status;
	}

	Sensor getSensor () {
		return sensor;
	}
	
	void setSensor (Sensor sensor) {
		this.sensor = sensor;
	}
	
	public void off() {
		status = OFF;
	}
	
	public void on() {
		status = ON;
	}
}
/* ON, OFF, getStatus(), setStatus(boolean), on(), off() pueden calificar para interfaz en Heater, 
 * talvez en sensores, y en lightindicator. getStatus y setStatus pueden estar en una interfaz y on y off en otra.
 */