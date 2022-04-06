//This program creates a program that defines two rectangles
//and calculates the width, height, perimeter, and area
/*                Rectangle
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 +width: double
 +height: double
 +Rectangle()
 +Rectangle(newWidth: double, newHeight: double)
 +getArea(): double
 +getPerimeter(): double
*/

public class Q9_1 {

	public static void main(String[] args) {
		//creates rectangles
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		//prints out rectangle tone's width, height, area, and perimeter
		System.out.println("Rectangle 1:");
		System.out.println("Width: " + r1.width);
		System.out.println("Height: " + r1.height);
		System.out.println("Area: " + r1.getArea());
		System.out.println("Perimeter: " + r1.getPerimeter());

		//prints out rectangle two's width, height, area, and perimeter
		System.out.println("\nRectangle 2:");
		System.out.println("Width: " + r2.width);
		System.out.println("Height: " + r2.height);
		System.out.printf("Area: %.2f", r2.getArea());
		System.out.printf("\nPerimeter: " + r2.getPerimeter());

	}
	

}

//creates class rectangle
class Rectangle {
	
	double width;
	double height;

	//no args rectangle
	Rectangle() {
		width = 1;
		height = 1;
	} 

	//set width and height
	Rectangle(double tempWidth, double tempHeight) {
		width = tempWidth;
		height = tempHeight;
	}

	//returns area
	double getArea() {
		return width * height; 
	}

	//returns perimeter
	double getPerimeter() {
		return 2 * (width + height);
	}
}