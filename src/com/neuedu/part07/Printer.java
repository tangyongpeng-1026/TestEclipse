package com.neuedu.part07;

public class Printer {
	
	/**
	 * 打印
	 */
	public void doPrint(){
		
	}
	
	//测试的main方法
	public static void main(String[] args) {
		
		Printer printer = new blackPrint();
		
		printer.doPrint();
		
	}
	
	

}

class blackPrint extends Printer{
	
	@Override
	public void doPrint(){
		System.out.println("黑白打印机");
		
	}
	
	
}

class colorPrint extends Printer{
	
	@Override
	public void doPrint(){
		System.out.println("彩色打印机");
		
	}
	
	
}