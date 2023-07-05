package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {
	
	public static void arithmetic(int num1, int num2) {
		System.out.println("덧셈결과->" + (num1+num2));
		System.out.println("뺄셈결과->" + (num1-num2));
		System.out.println("곱셈결과->" + (num1*num2));
		System.out.println("나눗셈 몫->" + (num1/num2));
		System.out.println("나눗셈 나머지->" + (num1%num2));
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 정수 입력:");
		int number1 = scanner.nextInt();
		System.out.println("두번째 정수 입력:");
		int number2 = scanner.nextInt();
		
		arithmetic(number1, number2);
	}
	
}

