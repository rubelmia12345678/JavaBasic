package encapsulation;

import extra.GetEncapsulation;

public class SetEncapsulation {

	public static void main(String[] args) {
		GetEncapsulation obj= new GetEncapsulation();
		obj.setA("r");
		obj.setB(10);
		obj.setC("A");
		
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		System.out.println(obj.getC());
	}

}
