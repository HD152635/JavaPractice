package org.dimigo.oop;

public class Car3 {

	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price; 

	public Car3(){
		
	}
	public Car3(String company, String model, String color, int maxSpeed, int price ) {
		
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
		
	}
	public Car3(String company, String model, String color, int maxSpeed) {
		
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	public Car3(String company, String model, String color) {
		
		this.company = company;
		this.model = model;
		this.color = color;
		
	}
	public String getCompany() {
		return company;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getPrice() {
		return price;
	}
	
	
	/*public void setCompany(String newCompany) {
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
*/
}