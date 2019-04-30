package main.java.AlejandroSanchez.coffeeMaker;

public interface Drive {
	
	default void off() {
		status = false;
	}
	
	default void on() {
		status = true;
	}
}
