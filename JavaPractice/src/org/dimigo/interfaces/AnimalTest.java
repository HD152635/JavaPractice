package org.dimigo.interfaces;

public class AnimalTest {
	public static void main(String[] args) {
		IAnimal.welcome();
		IAnimal[] animals = {
				new Dog(), new Cat()
		};
		for ( IAnimal a : animals ) {
			doAction(a);
		}
		IAnimal tiger = new IAnimal() {
			public void bark() {
				System.out.println("어흥");
			}
		};
	}
	private static void doAction(IAnimal a){
		a.eat();
		a.sleep();
		a.bark();
		if(a instanceof Dog)
			((Dog) a).wag();
		else if(a instanceof Cat)
			((Cat) a).scratch();
	}
}
