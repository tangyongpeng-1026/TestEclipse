package com.neuedu.part07;

public class Printer {
	
	/**
	 * ��ӡ
	 */
	public void doPrint(){
		
	}
	
	//���Ե�main����
	public static void main(String[] args) {
		
		Printer printer = new blackPrint();
		
		printer.doPrint();
		
	}
	
	

}

class blackPrint extends Printer{
	
	@Override
	public void doPrint(){
		System.out.println("�ڰ״�ӡ��");
		
	}
	
	
}

class colorPrint extends Printer{
	
	@Override
	public void doPrint(){
		System.out.println("��ɫ��ӡ��");
		
	}
	
	
}