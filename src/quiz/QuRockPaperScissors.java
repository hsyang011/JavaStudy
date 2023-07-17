package quiz;

import java.util.Scanner;

public class QuRockPaperScissors {
	
	public static void main(String[] args) {
		// 게임의 전체라운드와 현재라운드를 선언
		int allRound = 5;
		int currentRound = 0;
		// 문자열 배열 선언
		String[] rpsArr = { "가위", "바위", "보" };
		
		// 먼저 실행되고나서 재시작 여부를 따지기 위해 do~while문으로 선언한다.
		do {
			// 1~3의 난수를 생성
			int comNum = (int)(Math.random()*3 + 1);
			
			// 사용자로부터 숫자를 입력받는다.
			Scanner scanner = new Scanner(System.in);
			System.out.printf("무엇을 내겠습니까? (1: 가위, 2: 바위, 3: 보) : ");
			int userNum = scanner.nextInt();
			
			// 사용자가 입력한 숫자의 유효성을 검사한다.
			if (1<=userNum && userNum<=3) {
				System.out.printf("사용자: %s, 컴퓨터: %s\n", rpsArr[userNum-1], rpsArr[comNum-1]);
			} else {
				System.out.printf("가위바위보 할 줄 모르세요? 제대로 내세요^^;\n");
				continue;
			}
			
			// 승부를 판단하는 로직
			if (userNum-comNum==1 || userNum-comNum==-2) {
				System.out.printf("이겼습니다.\n");
			} else if (userNum-comNum==-1 || userNum-comNum==2) {
				System.out.printf("졌습니다.\n");
			} else {
				System.out.printf("비겼습니다.\n");
			}
			// 현재라운드를 1 증가
			currentRound++;
			
			// 현재라운드가 5회 이상 시행되었을 때 게임 진행 여부를 묻는다.
			if (currentRound >= allRound) {
				System.out.printf("%d번의 게임이 끝났습니다. 게임을 계속하시겠습니까? 재시작(1), 종료(0) : ", allRound);
				int code = scanner.nextInt();
				// 이중반복문을 탈출하기 위한 break label문
				escape:
				while (true) {
					switch (code) {
					case 0:
						// 0을 입력하면 즉시 return하여 프로그램을 종료한다.
						System.out.printf("게임이 종료되었습니다. 감사합니다.\n");
						return;
					case 1:
						// 1을 입력하면 현재라운드를 0으로 초기화하고 break label문을 이용하여 이중반복문을 탈출한다.
						System.out.printf("게임을 재시작합니다.\n");
						currentRound = 0;
						// switch문과 while문을 한 번에 빠져나간다.
						break escape;
					default:
						// 그 외의 값을 입력하면 while문에 의해 다시 사용자로부터 코드를 입력받는다.
						System.out.printf("잘못 입력하셨습니다. 재시작(1), 종료(0) 중에 입력하세요 : ");
						code = scanner.nextInt();
						break;
					}
				}
			}
		} while (true);
		
	}
}