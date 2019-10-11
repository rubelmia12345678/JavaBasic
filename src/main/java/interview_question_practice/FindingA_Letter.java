package interview_question_practice;

public class FindingA_Letter {

	public static void main(String[] args) {
		String country ="United States Of America";
		int count = 0;
		for (int i = 0; i < country.length(); i++) {
			if (country.charAt(i)=='e') {
				System.out.println(country.charAt(i)+count);
				System.out.println("Index of e:"+i);
				count++;
			}
			
		}

	}

}
