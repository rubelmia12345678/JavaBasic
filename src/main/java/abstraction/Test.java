package abstraction;

public class Test {

	public static void main(String[] args) {
		
		//MobileUser mu = new MobileUser(); can not create object of abstract class
		
		MobileUser mu;//reference variable
		mu = new Rahim();
		mu.sendMessage();
		
		mu = new Karim();
		mu.sendMessage();
		
		mu.call();

	}

}
