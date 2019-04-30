package main.java.AlejandroSanchez.coffeeMaker;

public class PressureValve {
	final boolean CLOSED = false;
	final boolean OPEN = true;
	boolean status;
	
	PressureValve () {
		status = CLOSED;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	void open() {
		status = OPEN; 
	}

	void close() {
		status = CLOSED; 
	}
}
