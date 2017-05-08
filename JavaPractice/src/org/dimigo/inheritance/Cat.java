package org.dimigo.inheritance;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}
	public void bark(){
		System.out.println("야옹야옹");
	}
	public void scratch(){
		System.out.println("할퀴기");
	}
}
