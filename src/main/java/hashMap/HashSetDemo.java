package hashMap;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// set can not have duplicate value
		HashSet<String> fruitsName = new HashSet<String>();
		//adding data
		fruitsName.add("Mango");
		fruitsName.add("Apple");
		fruitsName.add("Banana");
		fruitsName.add("Strabery");
		
		System.out.println("Fruits: "+fruitsName);
		System.out.println("Size: "+fruitsName.size());//getting the size
		
		fruitsName.remove("Banana");//removing a data
		System.out.println("Fruits: "+fruitsName);
		
		fruitsName.clear();// clearing all data
		System.out.println(fruitsName);
		
		boolean value = fruitsName.isEmpty();//checking if it is empty or not
		System.out.println(value);
		
		
		
		
		
		
		
		

	}

}
