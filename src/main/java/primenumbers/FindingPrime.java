package primenumbers;

import java.util.Scanner;

public class FindingPrime {
	public static void main(String[] args) {
		
		int m,n,count=0,totalPrime=0;
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter first number ");
		m = input.nextInt();
		
		System.out.println("Enter last number ");
		n = input.nextInt();
		
		for(int i=m;i<=n ;i++) {
			
			for(int p=2; p<=i-1;p++) {
				if(i%p==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(i);
				totalPrime++;		
			}
			count=0;
			
		}
	System.out.println("Total prime numbers "+totalPrime);

	}
}
