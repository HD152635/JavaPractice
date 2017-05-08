package org.dimigo.inheritance;

public class Tiger extends Animal{

	public Tiger(String name) {
		super(name);
	}
	public void bark(){
		System.out.println("어흥");
	}
	public void kill(){
		System.out.println("죽이당");
	}
}
