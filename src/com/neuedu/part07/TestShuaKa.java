package com.neuedu.part07;

public class TestShuaKa {

	public static void main(String[] args) {
		pay(new credit(1000), 1500);

	}
	
	
	public static void pay(BankCard bankCard,double paymoney){
		
		bankCard.shuaKa(paymoney);
		
	}

}
