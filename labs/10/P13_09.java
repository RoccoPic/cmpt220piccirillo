
public class P13_09 {
	public static void main(String arg[]) {
		Circle circle1 = new Circle(2, "blue", true);
		Circle circle2 = new Circle(4, "red", false);
		Circle circle3 = new Circle(2, "green", true);
		
		System.out.println("Circle1's radius: " + circle1.getRadius());
		System.out.println("Circle2's radius: " + circle2.getRadius());
		System.out.println("Circle3's radius: " + circle3.getRadius());
		
		System.out.println("Circle1 is " + (circle1.equals(circle2) ? "" : "not ") + "equal to circle2");

			System.out.println("Circle1 is " + (circle1.equals(circle3) ? "" : "not ") + "equal to circle3");
	}
}
