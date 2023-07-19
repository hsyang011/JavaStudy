package ex17collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

class Avengers {
	String name;
	String heroName;
	String weapon;

	public Avengers(String name, String heroName, String weapon) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", "
				+ "능력=" + weapon +"]";
	}
	
	// name(문자열)의 해쉬코드를 반환하도록 hashCode()를 재정의한다. 
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	// equals()를 재정의한다.
	@Override
	public boolean equals(Object obj) {
		System.out.printf("중복 제거용 equals()메소드 호출\n");
		// Object타입으로 전달받은 객체를 다운캐스팅한다.
		Avengers av = (Avengers)obj;
		// 호출하는 객체의 name과 매개변수로 전달받은 객체의 name이 같은지 판별한다.
		if (this.name.equals(av.name)) {
			return true;
		} else {
			return false;
		}
	}
}

public class QuHashSet {

	public static void main(String[] args) {
		HashSet<Avengers> set = new HashSet<Avengers>();

		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);		 

		System.out.printf("[최초 전체 정보출력]\n");
		for(Avengers av : set)
		{
			System.out.printf("%s\n", av.toString());			
		}

		// 사용자로부터 이름을 입력받는다.
		Scanner scan = new Scanner(System.in);
		System.out.printf("검색할 이름을 입력하세욤 : ");
		String searchName = scan.nextLine();
		// 검색된 객체를 저장할 findHero와 불타입변수 isFind를 선언한다.
		Avengers findHero = null;
		boolean isFind = false;
		
		// Iterator클래스를 이용하여 리스트를 반복참조한다.
		Iterator<Avengers> itr = set.iterator();
		while (itr.hasNext()) {
			// 현재 객체의 정보를 av가 참조한다.
			Avengers av = itr.next();
			// av의 이름과 searchName의 이름이 동일하다면
			if (av.name.equals(searchName)) {
				// findHero에 객체av를 담고 isFind를 true로 변경한다.
				findHero = av;
				isFind = true;
				break;
			}
		}
		
		// 나는 println()보다 printf()를 선호하므로 싹다 서식문자를 이용해서 출력한다.
		if (isFind) {
			/* findHero는 Avengers타입의 객체이지만 toString()에 의해
			print문에서는 문자열형태로 출력이 된다. */
			System.out.printf("%s\n", findHero);
			System.out.printf("요청하신 정보를 찾았습니다.\n");
		} else {
			System.out.printf("해당 영웅은 없어요ㅜㅜ\n");
		}
	}

}
