package interview_question_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MaxNumOfList {//how to find the maximum value from a array list

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(3);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		//easy way
		  Integer maxvalue = Collections.max(list);
		  System.out.println(maxvalue);
		 
		/*
		 * int maxv = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		 * System.out.println(maxv);
		 */

	}

}
