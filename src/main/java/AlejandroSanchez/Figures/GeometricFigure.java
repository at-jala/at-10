package main.java.AlejandroSanchez.Figures;

abstract class GeometricFigure extends Figure {
	protected String description;
	
	protected GeometricFigure(String description, String tag){
		super(tag);
		this.description = description;
	}
	
	protected String getFigureType() {
		return description;
	}
	
	protected String getDescription() {
		return description;
	}
	
	protected abstract double getArea();	

	protected abstract void drawTxt();
	
	protected void printDescription() {
		System.out.println("Tag: " + tag);
		System.out.println("Figure Type: " + getFigureType());
		System.out.println("Area: " + getArea());
	}
}
