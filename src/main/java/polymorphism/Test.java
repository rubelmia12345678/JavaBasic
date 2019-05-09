package polymorphism;

public class Test {

	public static void main(String[] args) {
		Shape s1 = new Shape();
		Shape s2 = new Rectangle(10, 20);// using super class reference variable because-
		Traingle t = new Traingle(10, 20);// only shape is returning by using other class constructor
											// and parameter

		System.out.println(s1.area());
		System.out.println(s2.area());
		System.out.println(t.area());
	}

}
