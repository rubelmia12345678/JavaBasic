package interview_question_practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
			//Scanner input = new Scanner(System.in);
			int num=123, sum=0, temp=0,r=0;
			//System.out.println("Enter any number: ");
			//num = input.nextInt();
			
			temp=num;
			while(temp!=0) {
				r=temp % 10;
				sum=sum *10 + r;
				temp = temp / 10;
				
			}
			System.out.println("Reverse= "+sum);
	}
}