package this_key;

public class ThisMethod {
	
	void message() {
		System.out.println("This is message method");
		
		
	}
	
	void display() {
		//message();//compiler automatically take if no this key is used
		this.message();//using message method by this keyword operator
		System.out.println("I am display method");
		
		
		
	}

}
