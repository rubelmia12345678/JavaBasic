package arrayList;

import java.util.ArrayList;

public class Array_List2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> name1 = new ArrayList<>();
		ArrayList<Integer> name2 = new ArrayList<>();
		ArrayList<Integer> name3 = new ArrayList<>();
		
		name1.add(10);
		name1.add(20);
		name1.add(30);
		name1.add(40);
		System.out.println(name1);
		
		name2.add(1);
		name2.add(2);
		name2.add(3);
		name2.add(4);
		System.out.println(name2);
		
		name3.addAll(name1);
		System.out.println("name3 = "+name3);
		
		
		boolean equal = name1.equals(name2);
		System.out.println("name1 = name2 ?: "+equal);
		
		equal = name1.equals(name3);
		System.out.println("name1 = name3 ?: "+equal);

	}

}
