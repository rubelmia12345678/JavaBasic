package array;

public class TwoDimensionalArry {

	public static void main(String[] args) {
		
		int [][] number = new int[2][3];
		
		number[0][0] =10;
		number[0][1] =20;
		number[0][2] =30;
		number[1][0] =40;
		number[1][1] =50;
		number[1][2] =60;
		
		for (int raw = 0; raw < 2; raw++) {//printing raw
			for (int colum = 0; colum <3 ; colum++) {//printing column
				
				System.out.println(number[raw][colum]);//sysout raw and column
			}
			
		}
	}
	

	
}
