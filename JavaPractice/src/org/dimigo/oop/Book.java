package org.dimigo.oop;

public class Book {

	private String title = "현대자동차";
	private String author = "제네시스";
	private int page = 225;

	public void setTitle(String newTitle) {
		title = newTitle;
	}
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String newAuthor) {
		author = newAuthor;
	}
	public String getAuthor() {
		return author;
	}
	
	public void setPage(int newPage) {
		page = newPage;
	}
	public int getPage() {
		return page;
	}

}