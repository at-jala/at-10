package main.java.AlejandroSanchez.coffeeMaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class PressureValveTest {

	@Test
	public void getStatus_pressureValveStatus_resultClosed() {
		PressureValve valve = new PressureValve();
		assertEquals(false, valve.getStatus());
	}

	@Test
	public void on_HeaterOn_resultTrue() {
		PressureValve valve = new PressureValve();
		valve.open();
		assertEquals(true, valve.getStatus());
	}

	@Test
	public void off_HeaterOff_resultFalse() {
		PressureValve valve = new PressureValve();
		valve.close();
		assertEquals(false, valve.getStatus());
	}

}
