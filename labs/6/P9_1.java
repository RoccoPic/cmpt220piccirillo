
public class P9_1 /*Rectangle*/{
	public static void main(String args[]) {
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		System.out.println("The width for Rectangle number 1 is:   " + rectangle1.width);
		System.out.println("The height for Rectangle number 1 is:  "  + rectangle1.height);
		System.out.println("The area for Rectangle number 1 is:  " + rectangle1.getArea());
		System.out.println("The perimeter for Rectangle number 1 is:  " + rectangle1.getPerimeter());
		
		System.out.println("The width for Rectangle number 2 is:   " + rectangle2.width);
		System.out.println("The height for Rectangle number 2 is:  "  + rectangle2.height);
		System.out.println("The area for Rectangle number 2 is:  " + rectangle2.getArea());
		System.out.println("The perimeter for Rectangle number 2 is:  " + rectangle2.getPerimeter());
		
		
}
}