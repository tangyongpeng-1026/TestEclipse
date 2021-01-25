package com.neuedu.part07;

public class TestBus {

	public static void main(String[] args) {
		
		Bus bus =new miniBus(4);
		payParkingFee(bus);

	}

	public static void payParkingFee(Bus bus){

		int parkingFee = bus.parkingFee();
		System.out.println("Í£³µ·ÑÎª"+parkingFee);
		
		
	}
	
	

}
