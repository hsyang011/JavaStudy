package ex04controlstatement;

public class QuPyramid04 {

	public static void main(String[] args) {
		for (int row=1; row<=9; row++) {
			for (int col=1; col<=5; col++) {
				if ((row<=5 && col<=row) || (row>5 && col<=10-row)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}

}
