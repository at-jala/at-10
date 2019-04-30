package main.java.AlejandroSanchez.coffeeMaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class LightIndicatorTest {

	@Test
	public void getStatus_lighIndicatorStatus_resultFalse() {
		LightIndicator light = new LightIndicator();
		assertEquals(false, light.getStatus());
	}

	@Test
	public void on_lighIndicatorOn_resultTrue() {
		LightIndicator light = new LightIndicator();
		light.on();
		assertEquals(true, light.getStatus());
	}

	@Test
	public void off_lighIndicatorOff_resultFalse() {
		LightIndicator light = new LightIndicator();
		light.off();
		assertEquals(false, light.getStatus());
	}

}
