package main.java.AlejandroSanchez.coffeeMaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class StartButtonTest {

	@Test
	public void getStatus_startButton_resultFalse() {
		StartButton button = new StartButton();
		assertEquals(false, button.getStatus());
	}

	@Test
	public void isPushed_startButton_resultFalse() {
		StartButton button = new StartButton();
		assertEquals(false, button.isPushed());
	}
}
