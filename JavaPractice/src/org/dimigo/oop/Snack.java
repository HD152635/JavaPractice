package org.dimigo.oop;

public class Snack {
	private String name,company;
	private int price,number;
	
	public Snack(String name,String company,int price, int number) {
		
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int clacPrice(){
		return number * price;
	}
	public String toString(){
		return String.format("이름 : %s\n", name)+String.format("제조사 : %s\n", company)+String.format("가격 : %,d원\n", price)+String.format("수량 : %d개\n", number);
	}
}
