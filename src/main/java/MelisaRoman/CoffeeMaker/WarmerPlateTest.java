package main.java.MelisaRoman.CoffeeMaker;
import static org.junit.Assert.*;

import org.junit.Test;

public class WarmerPlateTest {

	@Test
	public void startWarmingPot_correctResult() {
		WarmerPlate warmerPlate= new WarmerPlate();
		warmerPlate.startWarmingPot();
		assertEquals("Warming", warmerPlate.getCurrentProcess());
	}

	@Test
	public void stopWarmingPot_correctResult() {
		WarmerPlate warmerPlate= new WarmerPlate();
		warmerPlate.stopWarmingPot();
		assertEquals("Stop warming", warmerPlate.getCurrentProcess());
	}
}
