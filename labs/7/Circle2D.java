
public class Circle2D {
 public double x;
 public double y;
 private double radius;

public double getX() {
	return x;
}

public double getY() {
	return y;
}

public double getRadius() {
	return radius;
}
Circle2D(double x, double y, double radius){
	this.x = x;
	this.y = y;
	this.radius = radius;
}
Circle2D() {
	x = 0;
	y = 0;
	radius = 1;
}
public double getArea() {
	return Math.PI * Math.pow(radius, 2);
}
public double getPerimeter() {
	return 2 * (Math.PI * radius);
}
public boolean contains(double x, double y) {
	return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < radius;
}
public boolean contains(Circle2D circle) {
		return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) <= Math.abs(radius - circle.getRadius());
}	
public boolean overlaps(Circle2D circle) {
	return Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2)) <= radius + circle.getRadius();
}
}
