package constructor;

public class Teacher {
	String name,gender;
	int phone;
	
	Teacher(String n,String g, int p){//parameterized constructor
		name = n;
		gender = g;
		phone = p;
	}
	
	Teacher(){//it is default constructor
		
		System.out.println("No value");
		
		
	}
		
		void displayInfo() {
			
			System.out.println("Name :"+name);
			System.out.println("Gender :"+gender);
			System.out.println("Phone :"+phone);
			System.out.println("\n");
			
			
	}//special type of method
		//2 type constructor: default and parameterized 
		//no return type

}
