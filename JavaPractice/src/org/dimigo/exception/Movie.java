package org.dimigo.exception;

public class Movie {
	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge) {
		super();
		this.title = title;
		this.limitAge = limitAge;
	}

	public String getTitle() {
		return title;
	}

	public int getLimitAge() {
		return limitAge;
	}
	public void buyTicket(int age) throws Exception{
		if(age < limitAge){
			throw new Exception(String.format("%s은/는 %d세 이상 관람가입니다.",title,limitAge));
		}
		System.out.println(String.format("%s 즐감하세요.",title));
	}
}
