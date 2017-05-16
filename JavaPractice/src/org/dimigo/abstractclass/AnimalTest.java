package org.dimigo.abstractclass;

public class AnimalTest {
	public static void main(String[] args) {
//		Animal a = new Animal();
		Animal[] livestocks = {
				new Cow(), new Duck(), new Pig()
		};
		System.out.println("== 평온한 동물농장 ==");
		for(Animal a : livestocks){
			a.eat();
		}
		System.out.println("== 늑대가 나타났다!! ==");
		for(Animal a : livestocks){
			a.bark();
		}
	}
}
