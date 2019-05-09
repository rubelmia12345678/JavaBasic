package inheritance;

public class Teacher extends Person{
	
	String qualification;
	
	void displayInfo2() {
		//System.out.println("Name: "+name);
		//System.out.println("Age: "+age);
		displayInfo1();//using first method for printing
		System.out.println("Qualification: "+qualification);
		System.out.println();//for extra line
	}

}

