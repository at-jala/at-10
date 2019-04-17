package test.java.CristelhMiranda;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.CristelhMiranda.Person;

public class PersonTest {

	@Test
	public void printAttributes_classDataValuesAndMethod_correctAttribitesPrinted() {
		Person.names = "";
		Person jose = new Person("Jose", 25);
		Person maria = new Person("Maria", 25);
		Person pedro = new Person();
		
		String expected = " Jose Maria";				
		String actual = Person.printAllNames();
		
		assertEquals(expected, actual);		
	}
	
	@Test
	public void printAttributes_InstanceDataValuesAndMethod_correctAttribitesPrinted() {
		Person jose = new Person("Jose", 25);
		Person maria = new Person("Maria", 25);
		Person pedro = new Person();
		
		String expected1 = "Jose 25";
		String expected2 = "Maria 25";
		String expected3 = "------------- 10000";
		
		String actual1 = jose.printAttributes();
		String actual2 = maria.printAttributes();
		String actual3 = pedro.printAttributes();
		
		assertEquals(expected1, actual1);
		assertEquals(expected2, actual2);
		assertEquals(expected3, actual3);
	}	
}
