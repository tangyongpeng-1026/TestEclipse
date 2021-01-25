package com.neuedu.part07;

public class ColaEmployee {
     
	private String name;
	private int month;
	private int sal;
	
	public ColaEmployee(String name,int month){
		this.name=name;
		this.month=month;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public double allSal(){
		return sal;
		
	}
	
	
}

class SalariedEmployee extends ColaEmployee{
	
	private int monthsal;
	
	public SalariedEmployee(int monthsal,String name, int month) {
		super(name, month);
		this.monthsal=monthsal;

	}

	@Override
	public double allSal() {
		
		return monthsal;
	}
	
	

}

class HourlyEmployee extends ColaEmployee{
	private int hoursal;
	private int hour;
	
	public HourlyEmployee(int hoursal,int hour,String name, int month) {
		super(name, month);
		this.hoursal=hoursal;
		this.hour=hour;
	}

	@Override
	public double allSal() {
		
		return hoursal*hour;
	}

}

class SalesEmployee extends ColaEmployee{
	
	private int monthlySales;
	private double commission;

	public SalesEmployee(int monthlySales,double commission,String name, int month) {
		super(name, month);
		this.monthlySales=monthlySales;
		this.commission=commission;
	}

	@Override
	public double allSal() {
		
		return monthlySales*commission;
	}
	
	
	
}


