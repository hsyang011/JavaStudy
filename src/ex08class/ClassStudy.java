package ex08class;

class Book {
	// 멤버변수
	String title;
	String contents;
	int price;
	int pages;
	
	public Book(String title, String contents, int price, int pages) {
		this.title = title;
		this.contents = contents;
		this.price = price;
		this.pages = pages;
	}
	
	// 메소드1
	void reading() {
		System.out.printf("나는 가격이 %d인 %s책을 읽고있다.\n", price, title);
	}
	
	// 메소드2
	int pages() {
		return pages;
	}
}

public class ClassStudy {

	public static void main(String[] args) {
		
		Book book1 = new Book("C", "언어", 40000, 500);
		Book book2 = new Book("자바스크립트", "인터프리터", 30000, 250);
		
		System.out.println(book1.title);
		System.out.println(book1.contents);
		System.out.println(book1.price);
		System.out.println(book1.pages);
		
		
		System.out.println(book2.title);
		System.out.println(book2.contents);
		System.out.println(book2.price);
		System.out.println(book2.pages);
		
		book1.reading();
		int pages = book1.pages();
		System.out.println(pages);
	}

}
