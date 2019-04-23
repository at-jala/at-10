package Shape;

public class TestMain {
	public static void main(String[] args) {
		Shape newShape = new Shape();
		Rectangle newRectangle = new Rectangle(12, 6);
		Triangle newTriangle = new Triangle(12, 18);
		
		
		newRectangle.draw();
		newTriangle.draw();
		newShape.draw();
		
		newRectangle.setColor("blue");
		newTriangle.setColor("red");
		
		newRectangle.draw();
		newTriangle.draw();
		newShape.draw();
		
		
	}

}
