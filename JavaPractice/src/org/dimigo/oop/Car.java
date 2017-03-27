package org.dimigo.oop;

public class Car {

	private String company = "현대자동차";
	private String model = "제네시스";
	private String color = "검정색";
	private int maxSpeed = 225;
	private int price = 50000000; 

	public void setCompany(String newCompany) {
		company = newCompany;
	}
	public String getCompany() {
		return company;
	}
	
	public void setModel(String newModel) {
		model = newModel;
	}
	public String getModel() {
		return model;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	public String getColor() {
		return color;
	}
	
	public void setmaxSpeed(int newmaxSpeed) {
		maxSpeed = newmaxSpeed;
	}
	public int getmaxSpeed() {
		return maxSpeed;
	}
	
	public void setPrice(int newPrice) {
		price = newPrice;
	}
	public int getPrice() {
		return price;
	}

}