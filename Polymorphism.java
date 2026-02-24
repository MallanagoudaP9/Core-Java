package fidelity.programs;

class Shape {
	public void area(double a, double b) {
		System.out.println("Area of Shapes");
	}
}

class Rectangle extends Shape {
	public void area(double length, double breadth) {
		System.out.println("Area of Rectangle: " + (length * breadth));
	}
}

class Triangle extends Shape {
	public void area(double base, double height) {
		System.out.println("Area of Triangle: " + (0.5 * base * height));
	}
}

class Square extends Shape {
	public void area(double side1, double side2) {
		System.out.println("Area of Square: " + (side1 * side2));
	}
}

class Rhombus extends Shape {
	public void area(double d1, double d2) {
		System.out.println("Area of Rhombus: " + (0.5 * d1 * d2));
	}
}

public class Polymorphism_Shape {
	public static void main(String[] args) {
		
		Shape s;
		
		s = new Shape();
		s.area(0, 0);
		
		s = new Rectangle();
		s.area(6, 8);
		
		s = new Triangle();
		s.area(3, 7);
		
		s = new Square();
		s.area(9, 2);
		
		s = new Rhombus();
		s.area(5, 6);
	}

}
