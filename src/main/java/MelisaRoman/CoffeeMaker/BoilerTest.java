package main.java.MelisaRoman.CoffeeMaker;
import static org.junit.Assert.*;

import org.junit.Test;

public class BoilerTest {

	@Test
	public void startHeatingWater_correctResult() {
		Boiler boiler= new Boiler();
		boiler.startHeatingWater();
		assertEquals("Heating", boiler.getCurrentProcess());
	}

	@Test
	public void stopHeatingWater_correctResult() {
		Boiler boiler= new Boiler();
		boiler.stopHeatingWater();
		assertEquals("Stop heating", boiler.getCurrentProcess());
	}

}
