package ex05method;

class Calculator {
	
	void sum1(int n1, int n2) {
		int result = n1+n2;
		System.out.println(result);
		return;
	}
	
	int sum2(int n1, int n2) {
		int result = n1+n2;
		return result;
	}
	
}

public class MethodType {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.sum1(10, 20);
		int a = cal.sum2(10, 20);
		
//		sum1(10, 20);
//		int b = sum2(10, 20);
	}

}
