package common;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseNumber {

	//public static void main(String[] args) {
	@Test
		public void testNg() {
		Scanner input = new Scanner(System.in);
		int num, sum=0, temp,r;
		System.out.println("Enter any number: ");
		num = input.nextInt();
		
		temp=num;
		while(temp!=0) {
			r=temp % 10;
			sum=sum *10 + r;
			temp = temp / 10;
			
		}
		System.out.println("Reverse= "+sum);

	}

}
