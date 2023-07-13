package ex06array;

import java.util.Scanner;

public class QuFillArray {
	
	public static void main(String[] args) {
		// Scanner타입의 scanner인스턴스 생성
		Scanner scanner = new Scanner(System.in);
		// 크키가 10인 int형 배열 2개 선언
		int arr[] = new int[10];
		int sortArr[] = new int[10];
		
		// 정수를 입력받아 각각의 인덱스에 저장
		for (int i=0; i<arr.length; i++) {
			System.out.printf("%d번째 정수를 입력하세요: ", i+1);
			arr[i] = scanner.nextInt();
		}
		// 입력한 배열 요소를 모두 출력
		System.out.printf("순서대로 입력된 결과\n");
		for (int item : arr) {
			System.out.printf("%-2d", item);
		}
		
		System.out.printf("\n홀수/짝수 구분 입력 결과\n");
		// 홀수는 앞에서부터 채워나가야하므로 0으로 초기화.
		int oddIdx = 0;
		// 짝수는 뒤에서부터 채워나가야하므로 arr.length-1로 초기화.
		int evenIdx = arr.length-1;
		
		// 배열arr에서 요소 하나씩 꺼내서 반복한다.
		for (int num : arr) {
			// num이 홀수이면 sortArr의 앞에서부터 채워나가기 위해 oddIdx를 후위연산자로 증가시킨다.
			if (num%2 != 0) {
				sortArr[oddIdx++] = num;
			// num이 짝수이면 sortArr의 뒤에서부터 채워나가기 위해 evenIdx를 후위연산자로 감소시킨다.
			} else {
				sortArr[evenIdx--] = num;
			}
		}
		
		// sortArr의 모든 요소를 출력한다.
		for (int num : sortArr) {
			System.out.printf("%-2d", num);
		}
	}
	
}

