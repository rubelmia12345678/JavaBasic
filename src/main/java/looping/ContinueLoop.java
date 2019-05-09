package looping;

public class ContinueLoop {

	public static void main(String[] args) {
		
		for(int i =1; i<=100; i++) {
			if(i==10)
				continue;//continued loop after skipping if condition
			System.out.println(i);
		}

	}

}
