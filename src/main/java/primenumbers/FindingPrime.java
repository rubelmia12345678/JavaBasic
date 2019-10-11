package primenumbers;

import java.util.Scanner;

public class FindingPrime {
	public static void main(String[] args) {
		
		
		  int num,count=0;
		  Scanner input= new Scanner(System.in);
		  
		  System.out.println("Enter a number: ");
		  num = input.nextInt();

		for(int i=2;i<num ;i++) {
				if(num%i==0) {
					count++;
					break;
					}
				}
			if (count==0) {
				System.out.println("This is a prime number");
			} 
			else {
				System.out.println("This is not prime number");
			}
			input.close();
		
}}