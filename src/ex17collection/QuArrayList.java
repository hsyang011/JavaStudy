package ex17collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import common.Student;

public class QuArrayList {

	public static void main(String[] args) {
		//ArrayList<Student> list = new ArrayList<Student>();
		LinkedList<Student> list = new LinkedList<Student>();
		
		//저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		
		//객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
			
		//1.검색할 이름을 입력받음
		Scanner scan = new Scanner(System.in);
		System.out.printf("검색할 이름을 입력하세요 : ");
		String searchName = scan.nextLine();
		// boolean타입과 String타입 변수를 선언
		boolean isFind = false;
		String delInfo = null;
			
		//2.확장for문으로 컬렉션 전체를 접근
		for (Student st : list) {
			//3.검색결과 유/무에 따라
			if (searchName.equals(st.getName())) {
				// 삭제한 학생의 정보가 담긴 문자열을 delInfo에 저장한다.
				delInfo = st.toString();
				// 현재 st가 list의 몇 번 인덱스인지 구한다.
				int idx = list.indexOf(st);
				// list의 인덱스 번호로 해당 요소를 삭제한다.
				list.remove(idx);
				// 검색에 성공했으므로 true로 변환
				isFind = true;
				// 삭제한 이후 더이상 반복을 돌릴 이유가 없으므로 탈출.
				break;
			}
		}

		//검색결과 있을때…검색된 데이터 삭제
		if (isFind) {
			// 삭제하기 직전에 저장했던 문자열을 가져와서 삭제한 학생의 정보를 출력한다.
			System.out.printf("\"%s\"를 삭제했습니다.\n", delInfo);
		//검색결과 없을때...검색결과가 없다고 출력
		} else {
			System.out.printf("검색결과가 없습니다.\n");
		}

		//4.전체정보 출력
		// 이번에는 Iterator클래스를 사용하여 전체 출력을 한다.
		System.out.printf("===삭제 후 정보 출력===\n");
		Iterator<Student> itr = list.iterator();
		while (itr.hasNext()) {
			/* printf()의 서식문자를 %s로 받은 이유는, itr.next()자체가
			Student타입의 객체이므로 toString()에 의해 학생의 정보를 담고있는
			문자열로 출력이 되기 때문이다. */
			System.out.printf("%s\n", itr.next());
		}
	}

}
