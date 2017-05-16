package org.dimigo.abstractclass;

public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone[] phones= {
				new IPhone("iPhone 7","애플",900000),
				new IPhone("갤럭시 S8","삼성",800000)
		};
		for(SmartPhone phone:phones){
			System.out.println(phone);
			phone.turnOn();
			phone.pay();
			phone.useSpecialFunction();
			phone.turnOff();
			System.out.println();
		}
	}
}
