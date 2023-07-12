package ex12inheritance;

public class E07RideAndLoad02 {

	public static void main(String[] args) {
		// err를 사용하면 콘셀에 빨간색으로 표시된다.
		System.err.println("Child형 참조변수로 Child객체 참조");
		// 자식인스턴스를 자식참조변수로 참조한다.
		DeChild child = new DeChild("율곡이이", 49, "00학번");
		
		/* 오버라이딩 처리된 메소드이므로 참조변수와 상관없이 항상 자식쪽 메소드가 호출된다.
		메소드 오버라이딩은 자식쪽에 정의한 메소드가 부모쪽에 정의된 메소드를 가리게 된다.
		따라서 오버라이딩된 메소드를 호출할 때는 참조변수의 영향을 받지 않는다. */
		child.exercise();
		child.sleep();
		child.printParent();
		// 자식쪽에서 확장한 메소드로 부모에는 정의되어 있지 않다.
		child.study();
		// 부모쪽에 정의된 메소드로 매개변수가 없다.
		child.walk();
		// 자식쪽에 정의된 메소드로 오버로딩으로 정의되었다.
		child.walk(25);
		/* 정적메소드는 클래스명을 통해 호출한다. static의 기본규칙을 따르고, 오버라이딩의
		대상이 될 수 없다. */
		DeChild.staticMethod();
		
		////////////////////////////////////////////////////
		
		// 부모타입의 참조변수를 통해 자식인스턴스를 참조할 수 있다. 상속관계이므로 가능하다.
		System.err.println("Parent형 참조변수로 Child객체 참조");
		DeParent parent = new DeChild("퇴계이황", 35, "99학번");
		
		/* 오버라이딩 처리된 메소드이므로 참조변수에 상관없이 자식쪽 메소드가 호출된다.
		자식객체가 생성될 때 부모쪽의 메소드가 가려지게 되므로 참조변수에 영향을 전혀 받지
		않는다. */
		parent.exercise();
		parent.sleep();
		parent.printParent();
		
		/* 부모클래스의 참조변수로 자식인스턴스를 참조하면 부모의 영역까지만 접근할 수
		있으므로 자식영역에 정의된 메소드는 호출할 수 없다. */
//		parent.study(); // 에러발생
		parent.walk();
//		parent.walk(20); // 에러발생
		
		// 정적메소드는 오버라이딩 되지 않는다. 클래스명으로 호출한다.
		DeParent.staticMethod();
	}

}
