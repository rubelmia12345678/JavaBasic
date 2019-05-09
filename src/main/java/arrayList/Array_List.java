package arrayList;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		
		ArrayList<Integer> name = new ArrayList<Integer>();
		System.out.println("Array size: "+name.size());
		
		//adding value
		for (int i = 0; i < name.size(); i=i+10) {
			System.out.println("through loop: "+i);
			
		}
		name.add(10);
		name.add(20);
		name.add(30);
		name.add(3, 40);
		System.out.println("Array List contains: "+name);
		
		for (Integer i : name) {//printing by foreach loop
			System.out.println(i+" ");
		}
		
		System.out.println("Array size after adding: "+name.size());
		//removing elements
		name.remove(2);
		System.out.println("After removing "+name);
		
		/*//remove all mthod
		name.removeAll(name);
		System.out.println("After removing all: "+name);
		
		name.clear();//clear method
		System.out.println("After clearing: "+name);
		*/
		boolean check = name.isEmpty();//empty method
		System.out.println("After empty: "+check);
		
		boolean varify = name.contains(20);//contains method
		System.out.println("Is 20 in there ? ="+varify);
		
		int index = name.indexOf(40);//kon index e value ta ace
		System.out.println("The 40 is in index: "+index);
		
		name.set(1, 50);// replace a value
		System.out.println(name);
		
		int get = name.get(0);//get a value
		System.out.println("Index value is: "+get);
		
		
		
	}

}
