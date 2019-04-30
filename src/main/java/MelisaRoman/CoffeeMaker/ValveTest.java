package main.java.MelisaRoman.CoffeeMaker;
import static org.junit.Assert.*;

import org.junit.Test;

public class ValveTest {

	@Test
	public void open_valve_correctResult() {
		Valve valve = new Valve();
		valve.turnOn();
		assertEquals(true, valve.getStatus());
	}

	@Test
	public void close_valve_correctResult() {
		Valve valve = new Valve();
		valve.turnOff();
		assertEquals(false, valve.getStatus());
	}

	@Test
	public void isOpen_valve_correctResult() {
		Valve valve = new Valve();
		valve.turnOff();
		assertEquals(false, valve.inOn());
	}

}
