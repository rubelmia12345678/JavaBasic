package interview_question_practice;

public class ReverseString {
	public static void main(String[] args) {

		  
		  
		  String country = "United States Of America"; 
		  String obj = new StringBuffer(country).reverse().toString();
		  System.out.println(obj); 
/*
 * public static void main(String[] args) {
 *
 * 		String country = "United States Of America"; 
 * 		for (int i=country.length()-1;i>=0; i--) { 
 * 		System.out.println(country.charAt(i)); 
 * }
 */
	}	
}	

