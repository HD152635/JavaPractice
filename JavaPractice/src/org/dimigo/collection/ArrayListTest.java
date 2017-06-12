package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

import org.dimigo.interfaces.Cat;
import org.dimigo.interfaces.Dog;
import org.dimigo.interfaces.IAnimal;

public class ArrayListTest {

	public static void main(String[] args) {
		List<IAnimal> list = new ArrayList<>();
		list.add(new Dog());
		list.add(new Cat());
		bark(list);
	}

	private static void bark(List<IAnimal> list) {
		for(IAnimal a:list){
			a.bark();
		}
	}

}
