import java.util.Scanner;

public class P12_05 {
public static void main(String args[]) {
	 Scanner input = new Scanner(System.in); 
	 
	 System.out.print("Enter a color: ");
	 String color = input.next();
	 
	 System.out.print("Is the triangle filled, enter true or false: ");
	 boolean fill = input.nextBoolean();
	 
	 boolean runLoop = true;
	 do {
	 
		 	System.out.print("Enter 3 sides of a triangle: ");
		 		double side1 = input.nextDouble();
		 		double side2 = input.nextDouble();
		 		double side3 = input.nextDouble();
	 
		 		try { 
		 			Triangle triangle = new Triangle(side1, side2, side3);
		 			runLoop = false;
		 			triangle.setColor(color);
		 			triangle.setFilled(fill);
	 
		 			System.out.println(triangle.toString());
		 			System.out.println("Area: " + triangle.getArea());
		 			System.out.println("Perimeter: " + triangle.getPerimeter());
		 			System.out.println("Color: " + triangle.getColor());
		 			System.out.println("Triangle is " + (triangle.isFilled() ? "" : " not ") + "filled");
		
		 			} 	catch(IllegalTriangleException ex) {
		 System.out.println(ex.getMessage());
	 }
	    } while (runLoop == true);
	}
}
