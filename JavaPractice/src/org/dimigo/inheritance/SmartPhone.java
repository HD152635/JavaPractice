package org.dimigo.inheritance;

public class SmartPhone {
	private String model, company;
	private int price;
	public SmartPhone(){
		
	}
	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	public void turnOn(){
		System.out.println(model+"의 전원을 켭니다.");
	}
	public void turnOff(){
		System.out.println(model+"의 전원을 끕니다.");
	}
	public void pay(){
		
	}
	public void useSpecialFunction(SmartPhone phone){
		if(phone instanceof IPhone){
			((IPhone) phone).useAirDrop();
		}
		if(phone instanceof Galaxy){
			((Galaxy) phone).useWirelessCharging();
		}
	}
	public String toString() {
		return String.format("모델명 : %s, 제조사 : %s, 가격 : %,d원",model,company,price);
	}
}
