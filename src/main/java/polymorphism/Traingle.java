package polymorphism;

public class Traingle extends Shape {
	
	double base, height;
	
	Traingle(double base, double height){
		this.base = base;
		this.height = height;
	}
	
	double area () {//overriding the method of shape class
		
		System.out.print("Triangle: ");
		return 0.5*base*height;
		
	}

}
