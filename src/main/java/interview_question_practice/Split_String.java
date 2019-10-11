package interview_question_practice;

public class Split_String {

	public static void main(String[] args) {
		
		String country = "United States Of America";
		String[]s = country.split("");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			
		}
	}

}
