package ex07string;

public class E02StringMethod4 {

	public static void main(String[] args) {
		/*
		[시나리오] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		String[] juminArr = { "190419-3000000", "190419-4000000" };
		for (String str : juminArr) {
			char c = str.charAt(7);
			if (c=='1' || c=='3') {
				System.out.println(str + " => 남자");
			} else if (c=='2' || c=='4') {
				System.out.println(str + " => 여자");
			} else {
				System.out.println(str + " => 잘못된 주민번호입니다.");
			}
		}
		/*
		[시나리오] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		String emailArr[] = { "hong@daum.net", "not@naver" };
		for (String str : emailArr) {
			if (str.contains("@") && str.contains(".")) {
				System.out.println(str + " => 이메일형식입니다.");
			} else {
				System.out.println(str + " => 이메일형식이 아닙니다.");
			}
		}
		/*
		[시나리오]주민등록번호로 성별을 구분하는 프로그램을 indexOf()를
		이용해서 작성하시오.
		*/
		for (String str : juminArr) {
			if (str.indexOf("-1")==6 || str.indexOf("-3")==6) {
				System.out.println(str + " => 남자");
			} else if (str.indexOf("-2")==6 || str.indexOf("-4")==6) {
				System.out.println(str + " => 여자");
			} else {
				System.out.println(str + " => 잘못된 주민번호입니다.");
			}
		}
		/*
		[시나리오] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		String fileName = "my.file.images.jpg";
		int lastDotIndex = fileName.lastIndexOf(".");
		String fileExtension = fileName.substring(lastDotIndex+1);
		System.out.println(fileName + "의 확장자는 " + fileExtension + "입니다.");
	}

}
