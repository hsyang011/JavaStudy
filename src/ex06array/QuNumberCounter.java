package ex06array;

public class QuNumberCounter {
	
	public static void main(String[] args) {
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		
		// answer배열의 요소를 하나씩 꺼내서 그 값의 -1한 만큼의 인덱스의 값을 1 증가시킨다.
		// ex) num = 3이라면 counter[2]의 값을 1 증가시킨다.
		for (int num : answer) {
			counter[num-1]++;
		}
		
		// counter배열의 요소들을 출력한다.
		for (int i=0; i<counter.length; i++) {
			System.out.printf("counter[%d] => %d\n", i, counter[i]);
		}
	}
	
}