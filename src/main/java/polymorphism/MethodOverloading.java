package polymorphism;


public class MethodOverloading {
	//having same name but different condition

	int add(int a, int b) {
		int result;
		result = a + b ;
		return result;
	}
	
	int add(int a, int b , int c) {
		int syn;
		syn = a + b +c;
		return syn;
	}
	
	double add (double a, double b) {
		double syntex;
		syntex = a + b;
		return syntex;
		
	}

	public static void main(String[] args) {
		MethodOverloading object = new MethodOverloading();
		
		int r2args;
		int r3args;
		double r;
		
		r = object.add(5.5, 5.3);
		r2args = object.add(5, 5);
		r3args = object.add(10, 15, 25);
		
		System.out.println("Add result is = "+ r2args);
		System.out.println("Double result is = "+r);
		System.out.println("Add 3 arguments result is = "+r3args);
	}
		

}
