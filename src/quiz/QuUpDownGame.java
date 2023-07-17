package quiz;

import java.util.Scanner;

public class QuUpDownGame {
	
	public static void main(String[] args) {
		// 먼저 게임을 실행하고 재시작 여부를 따져야 하므로 do~while문으로 구현한다.
		do {
			// 게임의 승리/패배 여부를 판단하는 boolean타입 변수
			boolean flag = false;
			// 컴퓨터숫자와 사용자숫자
			int comNum = (int)(Math.random()*100 + 1);
			int userNum;
			
			// Scanner클래스 객체 생성
			Scanner scan = new Scanner(System.in);
			
			// 총 일곱번 반복한다.
			for (int cnt=0; cnt<7; cnt++) {
				System.out.printf("숫자를 입력하세요 : ");
				userNum = scan.nextInt();
				
				// 승부를 업/다운을 판단하는 로직
				if (comNum > userNum) {
					System.out.printf("업\n");
				} else if (comNum < userNum) {
					System.out.printf("다운\n");
				} else {
					System.out.printf("맞췄습니다!\n");
					flag = true;
					// 숫자를 맞추면 더이상 반복하지않고 break로 빠져나온다.
					break;
				}
			}
			
			// 게임의 승리/패배 여부에 따라 다르게 출력한다.
			if (flag) {
				System.out.printf("게임에 승리하였습니다.\n");
			} else {
				System.out.printf("게임에 패배하였습니다.\n");
			}
			
			System.out.printf("게임을 재시작하겠습니까? (0):종료, (1):재시작 : ");
			// 입력버퍼에 남아있는 개행문자('\n')를 제거해준다.
			scan.nextLine();
			// 사용자로부터 정수를 입력받는다.
			int code = scan.nextInt();
			
			// 이중반복문(switch, while)을 한 번에 탈출하기 위한 label
			escape:
			while (true) {
				switch (code) {
				case 0:
					System.out.printf("게임을 종료합니다.\n");
					return;
				case 1:
					System.out.printf("게임을 재시작합니다.\n");
					// break label문을 사용하여 switch문과 while문을 한 번에 탈출한다.
					break escape;
				default:
					System.out.printf("0과 1중에서 입력해주세요 : ");
					code = scan.nextInt();
				}
			}
		// 사용자가 게임을 종료할때까지 무한 반복한다.
		} while (true);
	}
}