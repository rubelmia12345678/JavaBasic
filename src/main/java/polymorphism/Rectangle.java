package polymorphism;

public class Rectangle extends Shape {
	
	double length, width;
	
	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	double area() {//overriding the method of shape class
		System.out.print("Rectangle: ");
		return length*width;
		
		
	}

}
