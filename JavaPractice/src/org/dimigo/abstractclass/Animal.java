package org.dimigo.abstractclass;

public abstract class Animal {
	public String name;
	
	public Animal(){
		
	}
	public Animal(String name){
		this.name=name;
	}
	public void eat(){
		System.out.println("냠냠");
	}
	public void sleep(){
		System.out.println("zzz");
	}
//	public void bark(){
//		System.out.println("...");
//	}
	public abstract void bark();
	public String toString(){
		return String.format("My name is %s.", name);
	}
}