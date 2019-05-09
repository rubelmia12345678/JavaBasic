package list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> states = new LinkedList<String>();
		states.add("New York");
		states.add("California");
		states.add("Arizona");
		states.add("washington");
		states.addFirst("Florida");
		states.addLast("verginia");
		states.remove("Florida");
		states.remove(3);
		
		
		
		for (String name : states) {
			System.out.println(name);
			
		}
		
		System.out.println("size: "+states.size());
		System.out.println("First Element: "+states.getFirst());
		System.out.println("Last Element: "+states.getLast());

	}
}
