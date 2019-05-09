package this_key;

public class Person {
	
	String name;
	int age;
	String hairColor;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	Person(String name, int age, String hairColor){
		this(name,age);//using first constructor property
		this.hairColor = hairColor;
		
		
		
		
	}
	void display() {
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("HairColor: "+hairColor);
	}

}
