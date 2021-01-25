package com.neuedu.part07;

public abstract class WorkerPerson {

	private String name;
	
    public abstract void eat();
	
	public abstract void speak();
	
	public abstract void live();
	
	

}

interface Consumer{
	
	public void userCredit();
	
}


 class zhongXueStudent extends WorkerPerson implements Consumer{

	@Override
	public void userCredit() {
		// TODO Auto-generated method stub
		
	}

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
