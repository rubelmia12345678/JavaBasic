package exception_handling;

public class Try_Catch_Finally {

	public static void main(String[] args) {
		
		try {
		int[] a= new int[3];
		a[4] = 10; //though 4 number index is not declared but compile time is not showing error
		
		}
		catch(ArithmeticException e) {//it is not arithmetic exception that is why will catch next
			System.out.println("Exception "+e);
			
		}
		/*catch(Exception e1){
			System.out.println("Exception "+e1);
			
		}*/
		finally {
			System.out.println("Rest of the coding");//even though throwing exception still running finally_block
		}
		
	}

}
