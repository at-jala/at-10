package main.java.MadayAlcala.Figures;

public class GeometricFigure extends Figure{
	String description;
	GeometricFigure(String description,String tag){
		super(tag);
		this.description = description;
	}
	public String getFigureType() {
		return description;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double area() {
		return 0;
	}
	public void drawTxt() {
		
	}
	public void printDescription() {
		System.out.println("Tag: "+tag);
		System.out.println("Figure Type: "+getFigureType());
		System.out.println("Area: "+area());
	}
	
	/*
	 * 	Tag: C-5
		Figure Type: Square
		Area: 25

	 * 
	 */
	
}
