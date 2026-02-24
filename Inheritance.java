package fidelity.programs;

class Product {
	int id = 78;
	String name = "Amul";
	
	public void display() {
		System.out.println("ID: " + id);
		System.out.println("Name: "+ name);
	}
}

class A extends Product {
	int count = 50;
	String category = "Butter";
	
	public void display() {
		super.display();
		System.out.println("Count: " + count);
		System.out.println("Category: "+ category);
	}
}

class B extends Product {
	int count = 90;
	String category = "Milk";
	
	public void display() {
		super.display();
		System.out.println("Count: " + count);
		System.out.println("Category: "+ category);
	}	
}

class C extends Product {
	int count = 56;
	String category = "Choco";
	
	public void display() {
		super.display();
		System.out.println("Count: " + count);
		System.out.println("Category: "+ category);
	}
}

class SubA extends A {
	int price = 30;
	
	public void display() {
		double totalPrice = count * price;
		System.out.println("ID: " + id);
		System.out.println("Name: "+ name);
		System.out.println("Category: "+ category);
		System.out.println("TotalPrice: "+ totalPrice);
	}
}

class SubB extends B {
	int price = 10;
	
	public void display() {
		double totalPrice = count * price;
		System.out.println("ID: " + id);
		System.out.println("Name: "+ name);
		System.out.println("Category: "+ category);
		System.out.println("TotalPrice: "+ totalPrice);
	}
}

public class Inheritance_Ex {

	public static void main(String[] args) {

		System.out.println("--------Class A--------");
		A a = new A();
		a.display();
		
		System.out.println("--------Class B--------");
		B b = new B();
		b.display();
		
		System.out.println("--------Class C--------");
		C c = new C();
		c.display();
		
		System.out.println("--------Class SubA--------");
		SubA subA = new SubA();
		subA.display();
		
		System.out.println("--------Class SubB--------");
		SubB subB = new SubB();
		subB.display();
		
	}

}
