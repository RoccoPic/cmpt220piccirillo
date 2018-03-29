import java.util.Scanner;

public class P11_01 {
public static void main(String args[]) {
	 Scanner input = new Scanner(System.in); 
	 System.out.print("Enter 3 sides of a triangle: ");
	 double side1 = input.nextDouble();
	 double side2 = input.nextDouble();
	 double side3 = input.nextDouble();
	 
	 System.out.print("Enter a color: ");
	 String color = input.next();
	 
	 System.out.print("Is the triangle filled, enter true or false: ");
	 boolean fill = input.nextBoolean();
	 
	 Triangle triangle = new Triangle(side1, side2, side3);
	 triangle.setColor(color);
	 triangle.setFilled(fill);
	 
	 System.out.println(triangle.toString());
	 System.out.println("Area: " + triangle.getArea());
	 System.out.println("Perimeter: " + triangle.getPerimeter());
	 System.out.println("Color: " + triangle.getColor());
	 System.out.println("Triangle is " + (triangle.isFilled() ? "" : " not ") + "filled");
}
}
