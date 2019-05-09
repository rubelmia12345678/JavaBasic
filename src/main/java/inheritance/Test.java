package inheritance;

public class Test {

	public static void main(String[] args) {
		
		Teacher p1 = new Teacher();
		p1.name = "Rubel Mia";
		p1.age = 25;
		p1.qualification = "BSc in CIS";
		p1.displayInfo2();
		
		
		Teacher p2 = new Teacher();
		p2.name = "Momin hossain";
		p2.age = 29;
		p2.qualification ="MBA";
		p2.displayInfo2();
	}
	

}
