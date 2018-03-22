
public class P10_11 {
public static void main(String args[]) {
	Circle2D c1 = new Circle2D(2, 2, 5.5);
	System.out.println("Circle1 area: " + c1.getArea()); 
	System.out.println("Circle1 perimeter: " + c1.getPerimeter()); 
	System.out.println("Does the circle contain Circle1: " + c1.contains(3,3));
	System.out.println("Does the circle contain the new circle: " + c1.contains(new Circle2D(4, 5, 10.5)));
	System.out.println("Does the circle overlap: " + c1.overlaps(new Circle2D(3, 5, 2.3)));
}
}
