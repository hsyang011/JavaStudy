package ex00study;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("정수를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.printf("문자열을 입력하세요 : ");
		String str = scan.nextLine();
		
		System.out.printf("\n정수:%d 문자열:%s\n", num, str);
	}

}
