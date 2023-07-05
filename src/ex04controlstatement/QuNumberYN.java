package ex04controlstatement;

import java.io.IOException;

public class QuNumberYN {

	public static void main(String[] args) throws IOException {
		System.out.println("하나의 문자를 입력하세요: ");
		char c = (char)System.in.read();
		
		String s = '0'<=c && c<='9' ? "숫자입니다.": "숫자가 아닙니다.";
		System.out.println(s);
	}

}
