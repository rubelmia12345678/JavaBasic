package interface_demo;

public class Cat implements Animal, Animal_2 {//interface support multiple inheritance but class not
	
	public void eat() {
		System.out.println("Cat can eat egg");
	}
	
	public void color() {
		System.out.println("Its a black cat");
	}

}
