package com.neuedu.part07;

public interface Person {

	public void eat();
	
	public void speak();
	
	public void live();
	
}

interface Salesman extends Person{
	
}

interface CollegeStudent extends Person{
	
}

class Worker implements Salesman,CollegeStudent{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void live() {
		// TODO Auto-generated method stub
		
	}
	
}