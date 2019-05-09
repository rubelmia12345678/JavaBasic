package primenumbers;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("How many numbers: ");
		int m = input.nextInt();
		
		int firstNum = 0;
		int secondNum = 1;
		int fibo;
		
		System.out.println(firstNum+" "+secondNum);
		
		for(int i =3; i<=m; i++) {

		fibo=firstNum+secondNum;
		System.out.println(fibo);
		firstNum=secondNum;
		secondNum=fibo;
	}
	}
}
