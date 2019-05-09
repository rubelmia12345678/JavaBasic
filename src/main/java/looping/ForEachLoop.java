package looping;

public class ForEachLoop {

	public static void main(String[] args) {
		
		String[] names = {"Rubel","Momin","Alamin","Easmin"};
		int[] numbers = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for (String x : names) {
			System.out.print(x+" ");
		}
		for (int i : numbers) {//type of loop then variable then array name.
			sum = sum + i;
		}
		System.out.println();
		System.out.print(sum);
				
	}

}
