package ex06array;

public class QuArray1To10 {
	
	public static void main(String[] args) {
		/* 1. 크기가 10인 정수타입의 배열을 선언한다.
		2. 반복문을 이용하여 배열을 채운다. 이때 배열은 1,2,3,4....순서대로 채운다.
		3. 2번에서 채운 배열을 출력한다.
		4. 위에서 채운 배열의 첫번째 값에서 마지막값까지 누적해서 더한다.
		5. 누적해서 더한 값을 출력한다. */
		
		// 크기가 10인 배열 생성
		int arr[] = new int[10];
		
		System.out.printf("초기화된 배열 요소\n");
		// 각 요소에 1~10값을 담아서 출력한다.
		for (int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.printf("%-2d", arr[i]);
		}
		System.out.printf("\n");
		
		int sum = 0;
		// foreach문을 이용해서 배열 요소의 합을 구한다.
		for (int num : arr) {
			sum += num;
		}
		System.out.printf("배열 전체 요소의 합: %d\n", sum);
	}
	
}