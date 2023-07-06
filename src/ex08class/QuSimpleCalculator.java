package ex08class;

class CalculatorEx {
	// 필드 선언
	double num1, num2;
	// 각각의 연산 횟수를 저장할 필드 선언
	int addCnt, minCnt, mulCnt, divCnt;
	
	// init()메소드가 호출될 때 필드를 0으로 초기화 시켜준다.
	void init() {
		addCnt = 0;
		minCnt = 0;
		mulCnt = 0;
		divCnt = 0;
	}
	
	// 연산횟수를 1증가시켜주고 연산된 결과를 반환시켜주는 메소드
	double add(double num1, double num2) {
		addCnt++;
		return num1+num2;
	}
	
	double min(double num1, double num2) {
		minCnt++;
		return num1-num2;
	}
	
	double mul(double num1, double num2) {
		mulCnt++;
		return num1*num2;
	}
	
	double div(double num1, double num2) {
		divCnt++;
		return num1/num2;
	}
	
	// 연산횟수를 각각 출력해주는 메소드
	void showOpCount() {
		System.out.println("덧셈횟수:" + addCnt);
		System.out.println("뺄셈횟수:" + minCnt);
		System.out.println("곱셈횟수:" + mulCnt);
		System.out.println("나눗셈횟수:" + divCnt);
	}
}

public class QuSimpleCalculator {

	public static void main(String[] args) {
		CalculatorEx cal = new CalculatorEx();
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}

}
