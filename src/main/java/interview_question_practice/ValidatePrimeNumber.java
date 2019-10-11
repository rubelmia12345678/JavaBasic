package interview_question_practice;

public class ValidatePrimeNumber {//find out if 39 is a prime number or not

	public static void main(String[] args) {
		int num =39;
		for (int i = 2; i<num/2; i++) {
			if (num%i==0) {
				
				System.out.println("Not prime number: "+num);
				break;
			}
				else {
					System.out.println("prime number: "+num);
				}
			}
		}	
	}
