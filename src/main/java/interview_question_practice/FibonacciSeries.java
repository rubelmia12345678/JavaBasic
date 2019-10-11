package interview_question_practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNumber = 0;
		int secondNumber = 1;
		
		for (int i = 1; i <=10; i++) {
			System.out.println(firstNumber);
			firstNumber=firstNumber+secondNumber;
			secondNumber=firstNumber-secondNumber;
			
		}

	}

}
