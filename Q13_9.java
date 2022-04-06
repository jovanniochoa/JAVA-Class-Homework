//This program makes two circles and compares if the radius
//is the same for both of them. It then returns if 
//they are the same or not.
public class Q13_9 {

	public static void main(String[] args) {
		//makes circle 1 and circle two
		Circle circle1 = new Circle(20, "orange", false);
		Circle circle2 = new Circle(20, "purple", true);

		//show radius
		System.out.println("Circle1 has a " + circle1.getRadius() + " radius and cicle2 has " + circle2.getRadius());

		if (circle1.equals(circle2)) {
			System.out.println("They are equal");
		}
		else {
			System.out.println("They are not equal");
		}
	}
}

//makes circle 
class Circle extends GeometricObject implements Comparable<Circle> {

	private double radius;

	//creates circle no args
	public Circle() {
		
	}
	
	public Circle(double tempRadius, String color, boolean filled) {
	radius = tempRadius;
	setColor(color);
	setFilled(filled);
	}
	
	//sets circle radius
	public Circle(double tempRadius) {
	radius = tempRadius;
	}
	
	//gets radius
	public double getRadius() {
	return radius;
	}
	
	//sets radius
	public void setRadius(double tempRadius) {
	radius = tempRadius;
	}
	
	//gets diameter
	public double getDiameter() {
	return 2 * radius;
	}
	
	@Override //gets area
	public double getArea() {
	return radius * radius * Math.PI;
	}
	
	
	@Override //gets perimeter
	public double getPerimeter() {
	return 2 * radius * Math.PI;
	}
	
	@Override //returns true if the same
	public boolean equals(Object o) {
	return this.compareTo((Circle)o) == 0;
	}
	
	@Override //allows for comparing
	public int compareTo(Circle o) {
	if (this.radius > o.radius)
		return 1;
	else if (this.radius < o.radius)
		return -1;
	else
		return 0;
	}
	
	@Override //makes to string
	public String toString() {
	return super.toString() + "Date made is " + getDateCreated() + " with radius " + radius;
	}
}



abstract class GeometricObject {
	private String color = "while";
	private boolean filled;
	private java.util.Date dateCreated;

	//makes geometric object
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	//makes a geometric object with args
	protected GeometricObject(String tempColor, boolean tempFilled) {
		dateCreated = new java.util.Date();
		color = tempColor;
		filled = tempFilled;
	}

	//gets color
	public String getColor() {
		return color;
	}

	//sets color
	public void setColor(String tempColor) {
		color = tempColor;
	}

	//returns filled
	public boolean isFilled() {
		return filled;
	}

	//sets filled
	public void setFilled(boolean tempFilled) {
		filled = tempFilled;
	}

	//gets date made
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override //converts to string
	public String toString() {
		return "made on " + dateCreated + " with color: " + color + " and is filled: " + filled;
	}

	//abstract get area
	public abstract double getArea();

	//abstract get perimeter
	public abstract double getPerimeter();

}
