package main.java.AlejandroSanchez.coffeeMaker;

public class StartButton {
	final boolean NOT_PUSHED = false;
	final boolean PUSHED = true;
	boolean status;
	
	StartButton() {
		status = NOT_PUSHED;
	}
	
	boolean getStatus() {
		return status;
	}
	
	void setStatus(boolean status) {
		this.status = status;
	}
	
	boolean isPushed() {
		return status;
	}
}
