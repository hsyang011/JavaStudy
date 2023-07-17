package quiz;

public class QuUpgradeGuGu {
	
	public static void main(String[] args) {
		// 기존 String클래스 대신, StringBuffer을 이용하여 문자열sb를 선언한다.
		// 버퍼를 이용하여 문자열을 저장하는 방식이기 때문에, 문자열의 길이가 변경될 때 기존 String클래스보다는 부담이 덜해진다.
		StringBuffer sb = new StringBuffer();
		
		// 2단부터 9단까지 반복한다.
		for (int dan=2; dan<=9; dan++) {
			// 문자열의 길이를 0으로 초기화, 즉 버퍼를 비워준다.
			sb.setLength(0);
			
			// 각 단 마다 9번 반복한다.
			for (int rep=1; rep<=9; rep++) {
				// 첫번째는 dan x 1을 출력해야 하므로 if조건문을 걸어 따로 구현해준다.
				if (rep == 1) {
					sb.append(dan);
					System.out.printf("%s x 1 = %d\n", sb, dan);
				// 그 외 나머지는 sb인스턴스의 append()메소드를 이용하여 문자열을 계속 추가해준다.
				} else {
					sb.append(" x " + dan);
					// 제곱을 구하기 위해 Math클래스의 pow()메소드를 이용한다.
					// pow메소드의 반환타입은 double이기에, 캐스팅연산자를 사용하여 int타입으로 강제형변환한다.
					System.out.printf("%s = %d\n", sb, (int)Math.pow(dan, rep));
				}
			}
			
		}
	}
}