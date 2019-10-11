package interview_question_practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateFromArray {//how to remove duplicate value from array

	public static void main(String[] args) {
		
		
		int array[] = {22, 22, 22, 33, 33, 33};
		int len=array.length;
				
		Set<Integer> duplicate = new HashSet<Integer>();
		for (int i = 0; i < len; i++) {
			duplicate.add(array[i]);
			
		}
		System.out.println(duplicate);
	}

}
