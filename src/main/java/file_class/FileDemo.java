package file_class;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		
		File dir = new File("/home/mahbub/Person");//giving the location //by default location project folder
		dir.mkdirs(); //making a folder
		String location = dir.getAbsolutePath();//getting path
		System.out.println(dir.getName());//getting name
		System.out.println(location);
		
		File file1 = new File(location + "/student.txt");//creating file in location 
		File file2 =  new File("/home/mahbub/Person/teacher.txt");//in specific location
		try {
		file1.createNewFile();
		file2.createNewFile();
		System.out.println("Files are created");
		
		}
		catch (Exception e) {
			System.out.println(e );
		}
		
		if (file1.exists()) {
			System.out.println("File 1 exist");
			
		}
		if (file2.delete()) {
			System.out.println("File 2 deleted");
			
		} else {
			System.out.println("File 2 exist");

		}
		
		/*if (dir.delete()) {//deleting folder
			System.out.println("directory is deleted");
			
		}*/
		

	}

}
