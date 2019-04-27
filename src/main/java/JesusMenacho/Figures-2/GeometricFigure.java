
public class GeometricFigure extends Figure {
	String description;

	GeometricFigure(String description, String tag) {
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

	public double getArea() {
		return 0;
	}

	public void drawTxt() {

	}

	public void printDescription() {
		System.out.println("Tag: " + tag);
		System.out.println("Figure Type: " + getFigureType());
		System.out.println("Area: " + getArea());
		System.out.println("Descripcion: " + getDescription());
	}



}
