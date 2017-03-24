package org.dimigo.oop;

public class BookTest {
	public static void main(String[] args) {
		Book book = new Book();
		
		System.out.println(book.title);
		System.out.println(book.author);
		System.out.println(book.pages);
		
		Book book2 = new Book();
		
		book2.set("너의 이름은", "신카이 마코토", 2017);
		book2.print("책 제목 : ","title");
		book2.print("작가 : ","author");
		book2.print("페이지 수 : ","pages");
		
		
	}
}
