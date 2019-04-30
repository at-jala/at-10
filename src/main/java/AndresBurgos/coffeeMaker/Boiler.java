package main.java.AndresBurgos.coffeeMaker;

public class Boiler extends Component {

	private double waterLevel;
	public Boiler(String name) {
		super(name);
		waterLevel=0;		
	}
	
	public double getWaterLevel() {
		return waterLevel;
	}
	
	public void addWater(double water) {
		waterLevel += water;
	}
	
	public void getWater(double water) {
		waterLevel -= water;
	}

}
