package ex04controlstatement;

public class Qu3Or7Sum {

	public static void main(String[] args) {
		int i=1, sum=0;
		
		while (i <= 100) {
			if ((i%3==0 || i%7==0) && i%(3*7)!=0) {
				sum+=i;
				System.out.println(i);
			}
			
			i++;
		}
		
		System.out.println("조건에 만족하는 모든 수의 합: " + sum);
	}

}
