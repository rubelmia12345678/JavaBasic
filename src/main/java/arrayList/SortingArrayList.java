package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> number = new ArrayList<>();
		
		number.add(3);
		number.add(100);
		number.add(-3);
		number.add(49);
		number.add(80);
		number.add(9);
		System.out.println("Before sortong: "+number);
		
		Collections.sort(number);//by default is sorted
		System.out.println("After sorting by ascending order: "+number);
		
		Collections.sort(number, Collections.reverseOrder());
		System.out.println("After sorting by descending order: "+number);
		
		
		

	}

}
