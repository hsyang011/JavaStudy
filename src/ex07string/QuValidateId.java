package ex07string;

import java.util.Scanner;

public class QuValidateId {
	
	public static boolean idValidate(String inputId) {
		// inputId의 길이를 len에 저장한다. 코드를 줄이기 위함.
		int len = inputId.length();
		// 8~12사이가 아니라면 false를 반환하고 메소드를 종료한다.
		if (!(8<=len && len<=12)) {
			return false;
		}
		
		// 0~len까지 반복하여 문자 검사를 한다.
		for (int i=0; i<len; i++) {
			// inputId의 i번째 문자를 char타입의 c에 저장한다.
			char c = inputId.charAt(i);
			// c가 a~z, A~Z, 0~9사이가 아니라면 false를 반환하고 메소드를 종료한다.
			if (!(('a'<=c && c<='z') || ('A'<=c && c<='Z') || ('0'<=c && c<='9'))) {
				return false;
			}
		}
		
		// 위의 조건문들을 무사히 통과했다면 true를 반환한다.
		return true;
	}
	
	public static void main(String[] args) {
		
		// Scanner타입의 scanner인스턴스 생성
		Scanner scanner = new Scanner(System.in);
		System.out.printf("아이디를 입력하세요: \n");
		// scanner인스턴스의 nextLine()메소드를 이용해 콘솔로부터 입력을 받아 id에 저장한다.
		String id = scanner.nextLine();
		
		/* 만약 String을 JavaScript처럼 배열로 만들고 싶다면 toCharArray()
		메소드를 사용하면 된다. 해당 메소드는 String을 char타입의 배열로 변환해준다. */
		char[] charArr = id.toCharArray();
		for (int i=0; i<charArr.length; i++) {
			System.out.print(charArr[i] + "-");
		}
		
		// idValidate()에 id를 인자로 넣어 호출한다.
		// 반환타입은 boolean이므로 boolean타입의 isAvailable변수가 반환값을 받도록 한다.
		boolean isAvailable = idValidate(id);
		
		if (isAvailable) {
			System.out.printf("사용할 수 있는 아이디입니다.\n");
		} else {
			System.out.printf("사용할 수 없습니다.\n");
		}
	}
	
}