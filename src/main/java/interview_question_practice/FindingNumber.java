package interview_question_practice;

public class FindingNumber {//Find out which number contains 3 from 10 to 30 ?

	public static void main(String[] args) {
		for (int i = 10; i <=30; i++) {
			if (String.valueOf(i).contains("3")) {
				System.out.println(i);
			}
			
		}

	}

}
