class Shape{
	void show() {
		System.out.println("This is a shape ");
	}
}
class Polygon extends Shape{
	void show() {
		System.out.println("Polygon is a shape ");
	}
	
}
class Rectangle extends Polygon{
	void show() {
		System.out.println("Rectangle is a polygon");
	}
}
class Triangle extends Polygon{
	void show() {
		System.out.println("Triangle is a polygon");
	}
	
}
class Square extends Rectangle{
	void show() {
		System.out.println("Square is a Rectangle");
	}
	
}
public class Q5 {
	public static void main(String[] args) {
		Square s1=new Square();
		Triangle t1=new Triangle();
		Rectangle r1=new Rectangle();
		Polygon p1=new Polygon();
		Shape s2=new Shape();
		
		s1.show();
		t1.show();
		r1.show();
		p1.show();
		s2.show();
	}
}
