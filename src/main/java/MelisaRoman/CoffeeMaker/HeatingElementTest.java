package main.java.MelisaRoman.CoffeeMaker;
import static org.junit.Assert.*;

import org.junit.Test;

public class HeatingElementTest {

	@Test
	public void turnOn_heatingElement_correctResult() {
		HeatingElement element = new HeatingElement();
		element.turnOn();
		assertEquals(true, element.getStatus());
	}

	@Test
	public void turnOff_heatingElement_correctResult() {
		HeatingElement element = new HeatingElement();
		element.turnOff();
		assertEquals(false, element.getStatus());
	}

	@Test
	public void isOn_heatingElement_correctResult() {
		HeatingElement element = new HeatingElement();
		element.turnOff();
		assertEquals(false, element.inOn());
	}

}
