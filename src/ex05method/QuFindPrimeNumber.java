package ex05method;

import java.util.Scanner;

public class QuFindPrimeNumber {
	
	public static boolean isPrimeNumber(int num) {
		/* 1은 소수가 아니기에 if문을 이용해 false를 반환하게 한다.
		이 조건문이 없다면 밑의 for문에 의해 엉뚱한 값이 나올 수 있으므로 예외로 둔다. */
		if (num == 1) {
			return false;
		}
		/* 2, 3은 소수이므로 true를 반환하게 한다.
		이 역시 밑의 for문에 의해 엉뚱한 값이 나올 수 있으므로 예외로 둔다. */
		if (num==2 || num==3) {
			return true;
		}
		
		// num이 4 이상일 때는 아래의 for문이 수행된다.
		/* d의 값은 num/2까지만 반복해서 소수인지를 판별한다.
		그 이유는 나누는값d가 num의 절반을 넘어가는 순간 몫은 1로 고정되기 때문에
		더이상 판별할 이유가 없기 때문이다. (for문의 연산부담을 줄이기 위해서이다.) */
		for (int d=2; d<=num/2; d++) {
			if (num%d == 0) {
				// d에 의해 나누어 떨어지면 소수가 아니므로 즉시 false를 반환한다.
				return false;
			}
		}
		
		// for문을 무사히 통과했다면 true값을 반환한다.
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("소수인지 아닌지를 판단할 양의 정수를 입력해주세요.");
		int number = scanner.nextInt();
		
		boolean isPrimeNum = isPrimeNumber(number);
		System.out.println("입력한 값 " + number + "는 " + "소수임이 " + isPrimeNum + "입니다.");
		
		
		//=================================================================================
		// 1~100사이의 소수를 전부 출력하는 로직
		for (int num=1; num<=100; num++) {
			boolean flag = isPrimeNumber(num);
			if (flag) {
				System.out.println("소수:" + num);
			}
		}
	}
	
}