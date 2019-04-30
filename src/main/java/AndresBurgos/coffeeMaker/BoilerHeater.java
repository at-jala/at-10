package main.java.AndresBurgos.coffeeMaker;

public class BoilerHeater extends Component implements Heater {

	private int status;

	public BoilerHeater(String name) {
		super(name);

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
