package org.dimigo.inheritance;

public class Person {
	public String name;
	
	public Person(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void sayHello(){
		System.out.println("Hello");
	}
	public void sayBye(){
		System.out.println("Bye");
	}
	public String toString(){
		return String.format("저는 %s입니다.",name);
	}
}
