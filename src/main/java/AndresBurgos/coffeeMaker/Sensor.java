package main.java.AndresBurgos.coffeeMaker;

public abstract class Sensor {
	protected String name;
	protected int status;

	public int getStatus() {
		return status;
	}

	public String getName() {
		return name;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
