package ex00study;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("정수를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.printf("정수를 입력하세요 : ");
		int num2 = scan.nextInt();
		System.out.printf("정수를 입력하세요 : ");
		int num3 = scan.nextInt();
		
		System.out.printf("\n정수:%d %d %d\n", num, num2, num3);
	}

}
