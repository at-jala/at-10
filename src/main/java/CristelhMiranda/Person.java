package main.java.CristelhMiranda;

public class Person {
	private String name;
	private int age;
	public static String names = "";
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
		names = names + " " + name; 
	}
	
	public Person(){
		this.name = "-------------";
		this.age = 10000;
	}
	
	public String printAttributes() {
		String attributes = name + " " + age;
		System.out.println(attributes);
		
		return attributes;
	}
	
	public static String printAllNames() {
		System.out.println(names);
		
		return names;
	}
}
