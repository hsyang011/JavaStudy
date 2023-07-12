package ex12inheritance;

//직사각형을 표현한 클래스
class Rectangle {
	// 멤버변수 너비, 높이
	private int width, height;
	
	// 생성자로 멤버변수 초기화
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	// 면적 출력
	public void showAreaInfo() {
		System.out.printf("직사각형 면적: %d\n", Area());
	}
	
	// 면적을 계산하여 정수형으로 반환하는 메소드
	public int Area() {
		return width*height;
	}
}

//정사각형을 표현한 클래스(정사각형은 직사각형의 일종)
class Square extends Rectangle {
	// 부모의 생성자를 leg, leg로 초기화
	public Square(int leg) {
		super(leg, leg);
	}
	
	// 부모클래스의 Area()함수를 이용하여 반환받은 면적을 출력한다.
	@Override
	public void showAreaInfo() {
		System.out.printf("정사각형 면적: %d\n", Area());
	}
}

public class QuRectangleMain {
	public static void main(String[] args) {
       	Rectangle rec = new Rectangle(4, 3);
       	rec.showAreaInfo();

 		Square sqr = new Square(7);
       	sqr.showAreaInfo();
 	}
}

