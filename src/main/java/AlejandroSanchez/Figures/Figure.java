package main.java.AlejandroSanchez.Figures;

abstract class Figure {
	protected String tag;
	
	protected Figure(String tag){
		this.tag = tag;
	}
	
	protected String getTag() {
		return tag;
	}

	protected abstract String getFigureType(); 
	
	protected abstract double getArea();

	protected abstract void drawTxt();

	protected abstract void printDescription();
}
