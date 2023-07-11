package ex12inheritance;

public class AnimalDog extends Animal {
	private String dogKind;
	private String name;
	
	public AnimalDog(String species, int age, String gender,
			String dogKind, String name) {
		super(species, age, gender);
		this.dogKind = dogKind;
		this.name = name;
	}
	
	public void bark() {
		System.out.printf("이름이 %s이고 종(포유류)이 %s인 강아지가 짖는다.\n", name, dogKind);
	}
	
	public void showDog() {
		System.out.printf("강아지의 종류: %s\n", dogKind);
		System.out.printf("이름: %s\n", name);
	}
}
