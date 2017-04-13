package org.dimigo.oop;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator cal1 = new Calculator(10,20);
		System.out.println("<< 실행 결과 >>\n");
		cal1.powerOn();
		cal1.add();
		cal1.sub();
		cal1.mul();
		cal1.div();
		cal1.powerOff();
	}
}
