package main.java.AndresBurgos.coffeeMaker;

public class PlateHeater extends Component implements Heater {

	private int status;

	public PlateHeater(String name) {
		super(name);
		status = TURN_OFF;
	}

	@Override
	public void turnOn() {
		status = TURN_ON;
	}

	@Override
	public void turnOff() {
		status = TURN_OFF;
	}
	
	public int getStatus() {
		return status;
	}
}
