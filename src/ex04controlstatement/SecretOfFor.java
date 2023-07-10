package ex04controlstatement;

public class SecretOfFor {

	public static void main(String[] args) {
		// 배열을 선언과 동시에 초기화
		int arr[] = { 30,40,50,60,70,80,90,100,110,120 };
		// 배열을 선언만 한다. 값을 할당하진 않았음.
		int reverseArr[] = new int[10];
		
		// arr의 값들을 reverseArr에 거꾸로 집어넣는 방법1
		for (int i=0; i<10; i++) {
			reverseArr[9-i] = arr[i];
		}
		
		// 배열의 모든 요소 출력1 (기존 for문)
		for (int i=0; i<10; i++) {
			System.out.printf("%-4d", reverseArr[i]);
		}
		// 개행
		System.out.printf("\n");
		
		// 배열의 모든 요소 출력2 (foreach문)
		for (int num : reverseArr) {
			System.out.printf("%-4d", num);
		}
		// 개행
		System.out.printf("\n");

		// arr의 값들을 reverseArr에 거꾸로 집어넣는 방법2
		// i와 k를 동시에 선언하고, 동시에 증감연산을 한다.
		for (int i=0, k=9; i<10; i++, k--) {
			reverseArr[k] = arr[i];
		}
		
		// 배열의 모든 요소 출력2 (foreach문)
		for (int num : reverseArr) {
			System.out.printf("%-4d", num);
		}
	}

}
