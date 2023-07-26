package ex00study;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("1번째 정수 입력 : ");
		int a = scan.nextInt();
		System.out.printf("2번째 정수 입력 : ");
		int b = scan.nextInt();
		System.out.printf("3번째 정수 입력 : ");
		int c = scan.nextInt();
//		scan.nextLine();
		String d = scan.nextLine();
		
		System.out.printf("a:%d, b:%d, c:%d d:%s\n", a, b, c, d);
	}

}
