package ex05method;

import java.util.Scanner;

public class QuTemperature {
	
	public static double celToFah(double cel) {
		return 1.8*cel + 32;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("섭씨를 입력하세요.");
		double celsius = scanner.nextDouble();
		
		double fahrenheit = celToFah(celsius);
		System.out.println("섭씨:" + celsius);
		System.out.println("화씨:" + fahrenheit);
	}
	
}