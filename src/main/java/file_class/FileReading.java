package file_class;

import java.io.File;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) {
		
		try {
			File file = new File("/home/mahbub/Person/student.txt");
			Scanner scan = new Scanner(file);
			
			while (scan.hasNextLine()) {
				String msg = scan.nextLine();
				System.out.println(msg);

			}
			scan.close();

		} catch (Exception e) {
			System.out.println();
		}
	
		

	}

}
