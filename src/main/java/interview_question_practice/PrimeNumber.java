package interview_question_practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		/*
		 * int m,n,count=0,totalPrime=0;
		 * 
		 * Scanner input= new Scanner(System.in);
		 * System.out.println("Enter first number "); m = input.nextInt();
		 * 
		 * System.out.println("Enter last number "); n = input.nextInt();
		 */
		
		for(int i=1;i<=100 ;i++) {
			
			for(int p=2; p<=i;p++) {
				if(i%p==0) {
					System.out.println(i+" Not prime");
					System.out.println("....");
					break;
				}
				
				  else { System.out.println(i+" prime number"); System.out.println("=====");
				  break; }
				 
			
		}
	
	}}}


