package main.java.AndresBurgos.coffeeMaker;

public class PresureValve extends Component {

	final int VALVE_OPEN = 1;
	final int VALVE_CLOSE = 0;
	private int status;
	private double pression;

	public PresureValve(String name) {
		super(name);
		status = VALVE_CLOSE;
		pression = 0;

	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public double getPression() {
		return pression;
	}

	public void setPression(double pression) {
		this.pression = pression;
	}
}
