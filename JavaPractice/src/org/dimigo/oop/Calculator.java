package org.dimigo.oop;

public class Calculator {
	private int num1,num2;
	public Calculator(){
		
	}
	public Calculator(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	public void powerOn(){
		System.out.println("전원을 켭니다.");
	}
	public void powerOff(){
		System.out.println("전원을 끕니다.");
	}
	public int add(){
		System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
		return num1+num2;
	}
	public int sub(){
		System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
		return num1-num2;
	}
	public int mul(){
		System.out.printf("%d + %d = %d\n",num1,num2,num1*num2);
		return num1*num2;
	}
	public double div(){
		System.out.printf("%d + %d = %.1f\n",num1,num2,num1/(double)num2);
		return num1/num2;
	}
}
