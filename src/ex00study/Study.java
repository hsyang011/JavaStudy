package ex00study;

public class Study {

	public static void main(String[] args) {
		// 배열의 합 출력
		int init = 0;
		int num = sumArray(init);
		System.out.printf("배열의 총합은 %d입니다.\n", num);
	}
	
	static int sumArray(int init) {
		// 변수와 배열 선언
		int sum = init;
		int[] arr = { 1,2,3,4,5,6,7,8,9,10 };
		
		// 배열의 총합
		for (int n : arr) {
			sum += n;
		}
		
		// sum 반환
		return sum;
	}

}
