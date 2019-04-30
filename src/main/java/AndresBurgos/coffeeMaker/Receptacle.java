package main.java.AndresBurgos.coffeeMaker;

public class Receptacle extends Component {

	final int RECEPTACLE_FILLED = 1;
	final int RECEPTACLE_EMPTY = 0;

	private double coffeeGrounds;
	private int status;

	public Receptacle(String name, double capacity) {
		super(name);
		coffeeGrounds = 0;
		status = RECEPTACLE_EMPTY;
	}

	public double getCapacity() {
		return coffeeGrounds;
	}

	public int getStatus() {
		return status;
	}

	public void fillReceptacle(double coffeeGrounds) {
		this.coffeeGrounds += coffeeGrounds;
		status = RECEPTACLE_FILLED;
	}
}
