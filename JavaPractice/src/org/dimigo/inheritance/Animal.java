package org.dimigo.inheritance;

public class Animal {
	public String name;
	
	public Animal(String name){
		this.name=name;
	}
	public void eat(){
		System.out.println("냠냠");
	}
	public void sleep(){
		System.out.println("zzz");
	}
	public void bark(){
		System.out.println("...");
	}
	public String toString(){
		return String.format("My name is %s.", name);
	}
}
