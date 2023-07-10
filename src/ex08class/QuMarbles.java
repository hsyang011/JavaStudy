package ex08class;

class ChildProperty {
	// 멤버변수 선언, 초기화는 하지 않았다.
	int numOfMarbles;
	
	// 생성자를 통해서 numOfMarbles에 값을 할당한다.
	public ChildProperty(int numOfMarbles) {
		this.numOfMarbles = numOfMarbles;
	}
	
	// printf()로 현재 구슬의 갯수를 출력한다.
	void showProperty() {
		System.out.printf("보유 구슬의 갯수: %d\n", numOfMarbles);
	}
	
	// 매개변수로 ChildProperty타입과 int타입을 선언한다.
	void obtainBead(ChildProperty opponent, int marbles) {
		// 현재 객체(자신)의 구슬의 갯수를 marbles만큼 추가시킨다.
		this.numOfMarbles += marbles;
		// 전달받은 객체(상대방)의 구슬의 갯수를 marbles만큼 감소시킨다.
		opponent.numOfMarbles -= marbles;
	}
}

public class QuMarbles {
	
	public static void main(String[] args) { 	
		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);
		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty();
		System.out.print("어린이2 : ");
		child2.showProperty();
		/*1차게임 : 어린이1은 어린이2의 구슬 5개 획득*/
		child1.obtainBead(child2, 5);
		/*2차게임 : 어린이2가 어린이1의 구슬 9개 획득*/
		child2.obtainBead(child1, 9);
		System.out.println("\n게임 후 구슬의 보유 개수");
		System.out.print("어린이1 : ");
		child1.showProperty();
		System.out.print("어린이2 : ");
		child2.showProperty();
	}
	
}