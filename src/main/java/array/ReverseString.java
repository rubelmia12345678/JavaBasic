package array;

public class ReverseString {
	
	/*public static void main(String[]arg) {
		String st= "rubel";
		int len= st.length();
		String rev = "";
		for (int i=len-1;i>=0;i--) {
			rev = rev +st.charAt(i);
		}
			
		System.out.println(rev);
		
	}*/
	public static void main(String[]arg) {
		
		String st = "DCBA";
		int len = st.length();
		String rev = "";
		for (int i=len-1;i>=0;i--) {
			rev = rev + st.charAt(i);
			
		}
		System.out.println(rev);
	}
	
}

