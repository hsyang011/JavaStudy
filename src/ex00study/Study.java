package ex00study;

public class Study {

	public static void main(String[] args) {
		String str = "Hello   hi  a bc";
		
		String[] arr = str.split(" ");
		
		int idx = 0;
		for (String s : arr) {
			System.out.printf("arr[%d]:%s ", idx++, s);
		}
	}

}
