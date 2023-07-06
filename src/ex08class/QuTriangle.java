package ex08class;

class Triangle {
	// 필드 선언
	double bottom, height;
	
	// 전달받은 매개변수를 이용해서 각각 필드를 초기화
	void init(double bottom, double height) {
		this.bottom = bottom;
		this.height = height;
	}
	
	// 삼각형의 넓이를 반환하는 메소드
	double getArea() {
		return (bottom*height)/2;
	}
	
	// 밑변 혹은 높이를 재설정한다.
	void setBottom(double newBottom) {
		bottom = newBottom;
	}
	
	void setHeight(double newHeight) {
		height = newHeight;
	}
}

public class QuTriangle {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : "+ t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : "+ t.getArea());
	}

}
