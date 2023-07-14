package ex15usefulclass;

/* Wrapper : 기본자료형의 데이터를 인스턴스화할 때 사용하는 클래스로 Boxing혹은
Unboxing을 통해 기본자료형의 데이터를 인스턴스화한다. 뒤에서 학습할 제네릭 클래스에서
필수적으로 사용된다. */
public class E01WrapperClass1 {

	public static void main(String[] args) {
		// 일반적인 정수의 연산
		int num1 = 10;
		int num2 = 20;
		int result = num1 + num2;
		System.out.println("result=" + result);
		
		/* JDK1.4 이전의 코딩형태
		기본자료형을 박싱 처리한 인스턴스에 대해서 산술연산을 진행할 때 언박싱을 위해
		intValue()와 같은 메소드를 호출해야 한다. */
		// 현재는 이와 같은 생성자는 Deprecated(디플리케이트)되었다.
		Integer n10Obj = new Integer(10);
		// 구버전과의 호환성을 위해 아직 남겨져 있는 상태이다.
		Integer n20Obj = new Integer(num2);
		int result2 = n10Obj.intValue() + n20Obj.intValue();
		System.out.println("result2=" + result2);
		
		Integer resultObj = new Integer(result2);
		System.out.println("결과값을 byte형 값으로 변경:" +
				resultObj.byteValue());
		System.out.println("결과값을 이진수로 변경:" +
				Integer.toBinaryString(result2));
		
		/* JDK1.5 이후 버전에서의 코딩형태
		오토박싱 혹은 오토언박싱이 지원되므로 기본자료형 변수를 선언하는 것과 동일하게
		코딩할 수 있다. */
		// 별도의 형변환이나 처리없이 기본자료형처럼 선언한다.
		Integer numObj1 = 100;
		Integer numObj2 = 200;
		int num3 = numObj1;
		// 객체이지만 정수처럼 연산이 가능하다.
		int result3 = numObj1 - numObj2;
		System.out.println("오토언박싱 이후 연산결과:" + result3);
		
		// int형의 최대/최소범위를 가진 상수값을 제공한다.
		System.out.println("int형의 최댓값:" + Integer.MAX_VALUE);
		System.out.println("int형의 최솟값:" + Integer.MIN_VALUE);
		// 진법 변환을 위한 메소드가 제공된다.
		System.out.println("10을 2진수로:" + Integer.toBinaryString(10));
		System.out.println("10을 8진수로:" + Integer.toOctalString(10));
		System.out.println("10을 16진수로:" + Integer.toHexString(10));
		
		/*
		parseInt() : 숫자형식의 문자열을 정수(숫자)로 변경한다. 
		parseDouble() : 실수로 변경한다. 
		 */
		String strNumber = "1000";
		//정수+문자열 => 101000
		System.out.println("10+strNumber="+ (10+strNumber));
		//정수+정수 => 1010
		System.out.println("10+strNumber를 숫자로 변경:"+
				(10 + Integer.parseInt(strNumber)));
		//위와 동일하게 문자열을 정수로 변경해준다. 
		System.out.println("10+strNumber를 숫자로 변경:"+
				(10 + Integer.valueOf(strNumber))); 
	  
		/*
		문자열을 숫자로 변경할때는 반드시 숫자형식만 기술해야한다. 
		"원"은 숫자가 아니므로 예외가 발생한다.
		 */
		String money = "120원";
//		System.out.println("120원:"+ Integer.parseInt(money)); //예외발생 
		 
		/*
		실수형태의 문자열을 숫자로 변경할때는 parseInt()를 사용할 수 
		없다. 앞과 동일한 예외가 발생한다. 
		 */
		String floatString = "3.14";		 
//		System.out.println(Integer.parseInt(floatString)); //예외발생 
		System.out.println("실수형(float)형으로 변경:"+Float.parseFloat(floatString));
		System.out.println("실수형(Double)형으로 변경:"+Double.parseDouble(floatString));

 
		/*
		Character 클래스의 주요메서드
		
		codePointAt() : 문자열에서 특정 index에 해당하는 한문자의 
			아스키코드를 반환한다. 
		 */
		System.out.println("ABCD에서 3번째 인덱스 D의 아스키코드");
		System.out.println(Character.codePointAt("ABCD", 3));

		/*
		isDigit() : 인자로 전달된 문자가 숫자인지 판단한다. 숫자일때
			true를 반환한다. 
		 */
		System.out.println("isDigit()를 통한 숫자판단");
		System.out.println(Character.isDigit('A')?"숫자임":"숫자아님");
		System.out.println(Character.isDigit(50)?"숫자임":"숫자아님");
		System.out.println(Character.isDigit('7')?"숫자임":"숫자아님");

		/*
		isLetter() : 문자인지 여부를 판단하는 메서드로 특수기호나 숫자형
			일때는 false를 반환한다. 
		 */
		System.out.println("isLetter()메소드를 통한 문자판단");
		System.out.println(Character.isLetter('가'));	 
		System.out.println(Character.isLetter('A'));	 
		System.out.println(Character.isLetter('#'));	 
		System.out.println(Character.isLetter('9'));	 

		/*
		isWhitespace() : 공백문자인지 판단하는 메서드. 공백문자일때
			true를 반환한다. 
		 */
		System.out.println("isWhitespace() 메소드로 공백문자 판단");
		System.out.println(Character.isWhitespace('A'));
		System.out.println(Character.isWhitespace(' ')); 
	
		/*
		isLowerCase() : 소문자인지 판단.
		isUpperCase() : 대문자인지 판단. 단 영문이 아닌경우 false를 
			반환한다.
		 */
		System.out.println("알파벳 대소문자 판단");
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isUpperCase('z'));
		System.out.println(Character.isLowerCase('a')); 
		System.out.println(Character.isUpperCase('Z')); 
		System.out.println(Character.isLowerCase('가'));
		
		/* [시나리오] 주어진 문자열안에 몇개의 공백문자(스페이스)가 있는지
		판단하는 프로그램을 작성하시오.
		참고) toCharArray() : 문자열을 char형 배열로 반환해주는
			String클래스에 정의된 메소드. */
		String whiteString = "h e l l     o";
		char[] charArr = whiteString.toCharArray();
		int cnt = 0;
		for (int i=0; i<charArr.length; i++) {
			if (Character.isWhitespace(charArr[i])) {
				cnt++;
			}
		}
		
		System.out.printf("whiteString의 공백의 갯수는 %d입니다.\n", cnt);
	}

}
