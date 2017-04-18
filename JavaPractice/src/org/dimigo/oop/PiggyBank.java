package org.dimigo.oop;

public class PiggyBank {
	public static int balance=0;
	
	public static void putMoney(FamilyMember member,int amount){
		System.out.println(member.getMemberName()+" : "+amount+"원 넣음");
		balance+=amount;
	}
	public static void printBalance(){
		System.out.printf("돼지저금통 총 금액 : %d원\n",balance);
	}
}
