package array;

import java.util.Scanner;

public class FindMaxandMin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] number = new int[10];
		int sum = 0;
		System.out.println("Please enter 10 numbers: ");
		
		for (int i=0; i<10; i++) {
			number[i] = input.nextInt();
		}
		
		for (int i=0; i<10;i++) {
			sum = sum + number[i];
		}
		System.out.println("This sum is : " +sum);
		System.out.println("The average is: " +sum/10);
		
		int max = number[0];
		int min = number[0];
		for (int i = 1; i < 10; i++) {
			if (max<number[i]) {
				max=number[i];
				
			}
			if (min>number[i]) {
				min=number[i];
				
			}
			
		}
		System.out.println("Maximum= "+max);
		System.out.println("Minimum= "+min);
		
	}
}	
