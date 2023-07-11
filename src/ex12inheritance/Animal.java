package ex12inheritance;

public class Animal {
	private String species;
	private int age;
	private String gender;
	
	public Animal(String species, int age, String gender) {
		this.species = species;
		this.age = age;
		this.gender = gender;
	}
	
	public void showAnimal() {
		System.out.printf("동물의 종류: %s\n", species);
		System.out.printf("나이: %d\n", age);
		System.out.printf("성별: %s\n", gender);
	}
}
