package ex12inheritance;

class Point {
	// x좌표와 y좌표
   	int xDot, yDot;
   	
   	// x, y초기화
   	public Point(int x, int y) {
 		xDot = x;
 		yDot = y;
   	}
   	
   	public void showPointInfo() {
 		System.out.printf("[x좌표:%d, y좌표:%d]\n", xDot, yDot);
   	}
}

//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle {	
	//멤버변수
	int radian; //반지름
	Point center; // Point타입 변수
	
	// radian초기화
	// Point타입 변수인 center는 초기화를 하기 위해 인스턴스를 생성한다.
	public Circle(int radian, int x, int y) {
		this.radian = radian;
		center = new Point(x, y);
	}
}

//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring {
	//멤버변수
	Circle innerCircle; //안쪽의 원
	Circle outerCircle; //바깥쪽의 원
	
	// Circle타입 변수들을 초기화하기 위해 각각 인스턴스를 생성해준다.
	// 매개변수 6개를 받아 3개씩 쪼개서 안쪽원과 바깥쪽원의 인스턴스를 생성한다.
	public Ring(int innerX, int innerY, int innerRadian, int outerX, int outerY, int outerRadian) {
		innerCircle = new Circle(innerRadian, innerX, innerY);
		outerCircle = new Circle(outerRadian, outerX, outerY);
	}
	
	public void showRingInfo() {
		System.out.printf("안쪽원의 정보:\n");
		// innerCircle인스턴스를 이용해 안쪽원의 반지름을 얻어온다.
		System.out.printf("반지름:%d\n", innerCircle.radian);
		// innerCircle인스턴스의 center인스턴스를 이용해 메소드를 호출한다.
		innerCircle.center.showPointInfo();
//		System.out.printf("[x좌표:%d, y좌표:%d]\n", innerCircle.center.xDot, innerCircle.center.yDot);
		
		System.out.printf("바깥쪽원의 정보:\n");
		// outerCircle인스턴스를 이용해 안쪽원의 반지름을 얻어온다.
		System.out.printf("반지름:%d\n", outerCircle.radian);
		// outerCircle인스턴스의 center인스턴스를 이용해 메소드를 호출한다.
		outerCircle.center.showPointInfo();
//		System.out.printf("[x좌표:%d, y좌표:%d]\n", outerCircle.center.xDot, outerCircle.center.yDot);
	}
}

public class QuRingMake {
	public static void main(String[] args) {
		Ring c = new Ring(1,1,3,2,2,9);
		c.showRingInfo();
	}
}

