package ex05method;

import java.util.Scanner;

public class QuCircleCalculator {
	
	public static double circleArea(double rad) {
		return 3.14*rad*rad;
	}
	
	public static double circleRound(double rad) {
		return 2*3.14*rad;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원의 반지름을 입력하세요.");
		double radius = scanner.nextDouble();
		
		double area = circleArea(radius);
		double round = circleRound(radius);
		
		System.out.println("원의 둘레(" + radius + "):" + round);
		System.out.println("원의 넓이(" + radius + "):" + area);
	}
	
}