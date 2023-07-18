package ex12inheritance;

class A1 {
	public A1() {} // A클래스의 디폴트생성자(생략)
}

class B1 extends A1 {
	public B1() { // B클래스의 디폴트생성자(생략)
		super(); // 부모클래스인 A의 생성자를 호출하는 문장(생략)
	}
}

public class test {

	public static void main(String[] args) {
		/* 자식클래스인 B를 통해서 인스턴스를 생성한다. 하지만 메모리상에는 부모의
		인스턴스가 먼저 생성된 후 이를 토대로 자식의 인스턴스가 생성된다. 만약
		자식쪽에서 부모생성자를 호출하지 못하게 되면 에러가 발생한다. */
		B1 b = new B1();
		A1 a1 = new B1();
		B1 b1 = (B1)a1;
	}

}
