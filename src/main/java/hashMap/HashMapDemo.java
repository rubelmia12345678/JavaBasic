package hashMap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		//put to add a data, get to get data
		HashMap<Integer,String> customer = new HashMap<Integer,String>();
		customer.put(101, "Rubel");
		customer.put(102, "Momin");
		customer.put(103, "Alamin");
		
		System.out.println(customer.get(102));//if i want to use name as key it has to be <String then Integer>
		System.out.println(customer.get(101));
		System.out.println(customer.get(103));

	}

}
