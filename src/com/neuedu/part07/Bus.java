package com.neuedu.part07;

public class Bus {
	
	public int parkingFee(){
		return 0;
	}

}

class miniBus extends Bus{

	private int hour;
	
	public  miniBus(int hour){
		this.hour=hour;
	}

	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	@Override
	public int parkingFee() {
		  return 3*hour;
	}



}

class bigBus extends Bus{
	
    private int hour;
    
    public bigBus(int hour){
		this.hour=hour;
	}

	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	@Override
	public int parkingFee() {
		  return 5*hour;
	}
	

}