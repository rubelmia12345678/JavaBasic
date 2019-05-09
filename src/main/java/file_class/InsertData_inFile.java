package file_class;

import java.util.Formatter;

public class InsertData_inFile {

	public static void main(String[] args) {
		
		try {
		Formatter formatter = new Formatter("/home/mahbub/Person/student.txt");
		formatter.format("My name is Rubel");
		
		formatter.close();//it has to be closed
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
