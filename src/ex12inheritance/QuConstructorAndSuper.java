package ex12inheritance;

class Car {
   	int gasoline;
   	
   	public Car(int gasoline) {
   		// 멤버변수 gasoline을 초기화한다.
   		this.gasoline = gasoline;

   		// 생성자 호출 순서 확인용
   		System.out.printf("Car() 생성자 호출\n");
   	}
}

class HybridCar extends Car {
   	int electric;
   	
   	// 매개변수 gasoline을 super()의 인자로 보내고 멤버변수 electirc은 초기화한다.
   	public HybridCar(int gasoline, int electric) {
   		super(gasoline);
   		this.electric = electric;
   		
   		// 생성자 호출 순서 확인용
   		System.out.printf("HybridCar() 생성자 호출\n");
   	}
}

class HybridWaterCar extends HybridCar {
   	int water;
   	
   	// 매개변수 2개를 super()의 인자로 보내고 멤버변수 water은 초기화한다.
   	public HybridWaterCar(int gasoline, int electric, int water) {
   		super(gasoline, electric);
   		this.water = water;

   		// 생성자 호출 순서 확인용
   		System.out.printf("HybridWaterCar() 생성자 호출\n");
   	}
 
   	public void showNowGauge() {
     	System.out.println("남은가솔린:"+gasoline);
     	System.out.println("남은전기량:"+electric);
     	System.out.println("남은워터량:"+water);
   	}
}

public class QuConstructorAndSuper {

	public static void main(String[] args)
	{
		System.out.printf("생성자는 부모생성자부터 먼저 생성됩니다.\n");
		HybridWaterCar hcar = new HybridWaterCar(10,20,30);
		hcar.showNowGauge();
	}
	
}

