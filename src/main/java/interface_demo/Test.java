package interface_demo;

public class Test {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		//can not make object of interface
		//interface variable can not be changed
		
		Cat c = new Cat();
		c.eat();
		c.color();
	}

}
