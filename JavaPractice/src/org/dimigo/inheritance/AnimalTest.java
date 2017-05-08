package org.dimigo.inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		Animal a = new Animal("동물");
		System.out.println(a); a.bark();
		Dog d = new Dog("멍멍이");
		System.out.println(d);
		d.bark(); d.wag();
		Cat c = new Cat("야옹이");
		System.out.println(c);
		c.bark(); c.scratch();
		Tiger t = new Tiger("호돌이");
		System.out.println(t);
		d.bark(); t.kill();
	}

}
