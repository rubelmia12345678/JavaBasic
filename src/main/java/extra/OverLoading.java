package extra;

public class OverLoading {
	
	void sum(int a) {
		System.out.println(a);
		
	}
	void sum(int a, int b) {
		System.out.println(a+b);
		
	}
	void sum(int a, int b, int c) {
		System.out.println(a+b+c);
		
	}
	
	public static void main(String[] args) {
		OverLoading obj = new OverLoading();
		obj.sum(10);
		obj.sum(20, 30);
		obj.sum(40, 50, 60);
		
	}

}
