package com.neuedu.part07;

public interface TestInterface {
    
	final int i=1;//接口里定义常量
    
    public abstract void testInterface();//接口里定义抽象方法
    
    public int name();//接口里定义抽象方法
    
}

interface TestInterfaceSon1 extends TestInterface{
	
	public int name1();
	
}

interface TestInterfaceSon2 extends TestInterface,TestInterfaceSon1{
	
}

class TestInterfaceC implements TestInterfaceSon2{

	@Override
	public void testInterface() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int name() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int name1() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}