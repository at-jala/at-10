package main.java.MelisaRoman.CoffeeMaker;
import static org.junit.Assert.*;

import org.junit.Test;

public class LightIndicatorTest {

	@Test
	public void turnOn_lightIndicator_correctResult() {
		LightIndicator light = new LightIndicator();
		light.turnOn();
		assertEquals(true, light.getStatus());
	}

	@Test
	public void turnOff_lightIndicator_correctResult() {
		LightIndicator light = new LightIndicator();
		light.turnOff();
		assertEquals(false, light.getStatus());
	}

	@Test
	public void isOn_lightIndicator_correctResult() {
		LightIndicator light = new LightIndicator();
		light.turnOff();
		assertEquals(false, light.inOn());
	}

}
