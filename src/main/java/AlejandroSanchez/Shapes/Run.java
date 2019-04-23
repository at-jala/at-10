package main.java.AlejandroSanchez.Shapes;

public class Run {
	public static void main(String[] args) {
		Shape    s  = new Shape();
		Square   q1 = new Square();
		Square   q2 = new Square(4, 3);
		Triangle t  = new Triangle(4, 3);
		Line     l1 = new Line();
		Shape    l2 = new Line();
		
		System.out.println(q1.getArea());
		System.out.println(q2.getArea());
		System.out.println(t.getArea());
		
		s.draw();
		q1.draw();
		q2.draw();
		t.draw();
		l1.draw();
		l2.draw();
	}
}
