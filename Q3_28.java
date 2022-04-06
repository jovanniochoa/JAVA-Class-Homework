//This program determines if one rectangle is inside of the other rectangle
//if it is, isn't or is intersecting. The program displays so
import java.util.Scanner;
import java.lang.*;

public class Q3_28 {
	
	public static void main(String[] args) {
		
		//load variables
		double r1X = 0;
		double r1Y = 0;
		double r1Width = 0;
		double r1Height = 0;
		double r2X = 0;
		double r2Y = 0;
		double r2Width = 0;
		double r2Height = 0;
		
		//scan variables for rectangle 1
		Scanner in = new Scanner(System.in);
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		r1X = in.nextDouble();
		r1Y = in.nextDouble();
		r1Width = in.nextDouble();
		r1Height = in.nextDouble();
		
		//scan variables for rectangle 2
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		r2X = in.nextDouble();
		r2Y = in.nextDouble();
		r2Width = in.nextDouble();
		r2Height = in.nextDouble();
		
		//check if all the points are greater or equal to the second rectangle
		//if it is, it means that the rectangle is within the first 1
		if (r1Y+(r1Height/2) >= r2Y+(r2Height/2) && r1Y-(r1Height/2) <= r2Y-(r2Height/2) 
		  && r1X-(r1Width/2) <= r2X-(r2Width/2) && r1X+(r1Width/2) >= r2X+(r2Width/2)) 
		{
			System.out.println("r2 is inside r1");
		}// check if the second rectangle is close to any of the four sides of the rectangle.
		else if ( (Math.abs(r1Y+(r1Height/2) - r2Y+(r2Height/2)) - Math.abs(r1Y-(r1Height/2) - r2Y+(r2Height/2))
			     == r1Height) || (Math.abs(r1Y-(r1Height/2) - r2Y+(r2Height/2)) - Math.abs(r1Y+(r1Height/2) - 
			    r2Y-(r2Height/2)) == r1Height) || (Math.abs(r1X-(r1Width/2) - r2X-(r2Width/2)) - 
			    Math.abs(r1X+(r1Width/2) - r2X-(r2Width/2)) == r1Width) || (Math.abs(r1X+(r1Width/2) - 
			    r2X+(r2Width/2)) - Math.abs(r1X-(r1Width/2) - r2X+(r2Width/2)) == r1Width))
		{
			System.out.print("r2 does not overlap r1");
		} 
		else {
			System.out.print("r2 overlaps r1");
		}
	}

}
