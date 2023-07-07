package ex04controlstatement;

public class QuPyramid03 {

	public static void main(String[] args) {
		
		for (int row=1; row<=5; row++) {
			for (int col=1; col<=9; col++) {
				if (5-row<col && col<5+row) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}

}
