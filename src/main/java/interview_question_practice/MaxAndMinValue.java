package interview_question_practice;

import java.util.Arrays;

public class MaxAndMinValue {//how to find min and max from array in java

	public static void main(String[] args) {
		
		int array[] = {14,46,47,86,43,36,66,85,30};
		
		int max = Arrays.stream(array).max().getAsInt();
		System.out.println(max);
	
		int min = Arrays.stream(array).min().getAsInt();
		System.out.println(min);
		
		int secondMax = Arrays.stream(array).filter(i->i<max).max().getAsInt();
		System.out.println(secondMax);
	}

}
