package looping;

public class BreakLoop {

	public static void main(String[] args) {
		
		for(int i=1; i<=100;i++) {
			
			if(i==10)
				break;//it supposed to run till 100 but it breaks to the next condition
			System.out.println(i);
		}
		
	}

}
