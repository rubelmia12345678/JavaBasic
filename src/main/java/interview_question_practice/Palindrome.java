package interview_question_practice;

public class Palindrome {//Palindrome means after reverse the word will be same like "MOM"

	public static void main(String[] args) {
		String name = "MOM";
		StringBuilder rev = new StringBuilder(name);
		rev.reverse();
		System.out.println(rev);
		
		if (name.equalsIgnoreCase(rev.toString())) {
			System.out.println("It's plandrome number");
		} 
		else{
			System.out.println("Not plandrome");
		}

	}

}
