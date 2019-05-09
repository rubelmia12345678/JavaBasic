package array;

public class Array1 {

	public static void main(String[] args) {
		
		int [] name = new int [5];
		
		name[0] = 10;
		name[1]=  20;
		name[2] = 30;
		name[3] = 40;
		name[4] = 50;
		
		int len = name.length;
		System.out.println("Array lenht:" +len);
		
		int sum = name[0] + name[1]+ name[2] +name[3] +name[4];
		System.out.println("Sum of the Array: "+sum);

	}

		
		
	}
