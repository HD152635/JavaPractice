package org.dimigo.interfaces;

public interface IAnimal {
	String SCHOOL = "디미고";
	String FARM_NAME = "디미 동물농장";
	
	void bark();
	
	// ^JDK8
	// 1. static method
	static void welcome(){
		System.out.println(FARM_NAME + "에 오신걸 환영합니다.");
	}
	public default void test(){
		
	}
	default void sleep(){
		System.out.println("쿨쿨");
	}
	default void eat(){
		System.out.println("냠냠");
	}
}
