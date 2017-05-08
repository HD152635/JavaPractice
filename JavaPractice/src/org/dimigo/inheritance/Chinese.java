package org.dimigo.inheritance;

public class Chinese extends Person{
	public Chinese(String name){
		super(name);
	}
	public void sayHello(){
		System.out.println("니하오");
	}
	public void sayBye(){
		System.out.println("쨔이찌엔");
	}
	public String toString(){
		return String.format("저는 중국사람 %s입니다.",name);
	}
	
}
