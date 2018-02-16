import java.util.Scanner;
public class P6_19 {
	public static void main(String args[]) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter three sides for a triangle:");
		 	double side1 = input.nextDouble();
			double side2 = input.nextDouble();
			double side3 = input.nextDouble();
		boolean isValid = isValid(side1, side2, side3);
		if (isValid == true) {
			System.out.println("This triangle is valid"); 
			double area = area(side1, side2, side3);
			System.out.println("The area of the true triangle is " + area);
		} else {
			System.out.println("This triangle is invalid");
		}
			
	}
	//Return true if the sum of every two sides is greater than the third side
	public static boolean isValid(double side1, double side2, double side3) {
	 if (side1 + side2 > side3) 
	 {
			if (side1 + side3 > side2) 
			{
				if (side2 + side3 > side1)
				{
					return true;
				} 
			}
	 }
	return false;
	}
	//Return the area of the triangle
	public static double area(double side1, double side2, double side3) {
		double temp;
		if (side2 < side1 && side2 < side3) {
			temp = side1;
			side1 = side2;
			side2 = temp;
		} else if (side3 < side1 && side3 < side2) {
			temp = side1;
			side1 = side3;
			side3 = temp;
		}  if (side3 < side2) {
			temp = side2;
			side2 = side3;
			side3 = temp;
		
	}
		double area = .5*(side1 * side2);
		return area;
	}
}
