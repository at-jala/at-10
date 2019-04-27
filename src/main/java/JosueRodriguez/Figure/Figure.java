package main.java.JosueRodriguez.Figure;
public abstract class Figure {
	protected String tag;
	public Figure(String tag){
		this.tag=tag;
	}
	
	public abstract String getTag();

	public abstract String getFigureType();

	public abstract double getArea();

	public abstract void drawTxt();

	public abstract void printDescription();
}
