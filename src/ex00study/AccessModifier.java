package ex00study;

import java.util.Date;

class A {
	void aFunc() {
		System.out.printf("안녕하세요!\n");
	}
}

public class AccessModifier {

	public static void main(String[] args) {
		Date date = new Date();
		date.getTime(); 
		
		A a = new A();
		a.aFunc();
	}

}
