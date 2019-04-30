package main.java.MadayAlcala.CoffeMaker;

public class CoffeMaker {
	
	private Boild boiler;
	private WarmerPlate plate;
	private BrewButton brewButton;
	private ReliefValue reliefValue;
	
	public CoffeMaker(Boild boiler, WarmerPlate plate, BrewButton brewButton, ReliefValue reliefValue) {
		this.boiler = boiler;
		this.plate = plate;
		this.brewButton = brewButton;
		this.reliefValue = reliefValue;
	}
	

}
