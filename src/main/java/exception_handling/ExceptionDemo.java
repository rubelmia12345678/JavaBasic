package exception_handling;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
		int x = 10;
		int y = 0;
		int result = x/y; //can not be divide 5 by 10 that reason will show exception
		System.out.println("Result: "+result);
	}
		
		
		catch(ArithmeticException e1) {//sub class exception should be before super exception class
			System.out.println(e1);
			
		}
		catch(Exception e){// it can be multiple catch-block	
			System.out.println("Exception "+e);
			
			}
		
		System.out.println("Last line of the code");

	}

}
