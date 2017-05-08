package org.dimigo.inheritance;

public class Japanese extends Person{
	public Japanese(String name){
		super(name);
	}
	public void sayHello(){
		System.out.println("오하이요");
	}
	public void sayBye(){
		System.out.println("사요나라");
	}
	public String toString(){
		return String.format("저는 일본사람 %s입니다.",name);
	}
	
}
