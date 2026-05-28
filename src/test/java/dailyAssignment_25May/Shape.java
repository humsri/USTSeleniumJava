package dailyAssignment_25May;

public class Shape {
	
	void display() {
		System.out.println("This is shape class");
	}
	public static void main(String[] args) {
		
		Circle c = new Circle();
		c.display();
		c.areaOfCircle();
		
		System.out.println();
		
		Rectangle r = new Rectangle();
		
		r.display();
		r.areaOfRectangel();
	}
}
