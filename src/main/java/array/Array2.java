package array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			int[] number = new int[10];
			int sum = 0;
			System.out.println("Please enter 10 numbers: ");
			
			for (int i=0; i<10; i++) {
				number[i] = input.nextInt();
			}
			/*number[0] = input.nextInt();
			number[1] = input.nextInt();
			number[2] = input.nextInt();
			number[3] = input.nextInt();
			number[4] = input.nextInt();
			number[5] = input.nextInt();
			number[6] = input.nextInt();
			number[7] = input.nextInt();
			number[8] = input.nextInt();
			number[9] = input.nextInt();*/
			
			for (int i=0; i<10;i++) {
				sum = sum + number[i];
			}
			System.out.println("This sum is : " +sum);
			System.out.println("The average is: " +sum/10);
			

	}

}
