package main.java.AndresBurgos.coffeeMaker;

public class Pot extends Component {

	private double coffeeLevel;

	public Pot(String name) {
		super(name);
		coffeeLevel = 0;
	}

	public double getCoffeeLevel() {
		return coffeeLevel;
	}

	public void setCoffeeLevel(double coffeeLevel) {
		this.coffeeLevel = coffeeLevel;
	}

	public void fillPot(double coffee) {
		coffeeLevel += coffee;
	}

	public void getCoffee(double coffee) {
		coffeeLevel -= coffee;
	}

}
