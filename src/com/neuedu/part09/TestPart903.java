package com.neuedu.part09;

import java.util.Calendar;

public class TestPart903 {

	public static void main(String[] args) {
		// �����ǰ�µ�����
		System.out.println("����һ  "+"���ڶ�  "+"������  "+"������  "+"������  "+"������  "+"������  ");
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DATE, 1);
		int start = c.get(Calendar.DAY_OF_WEEK)-1;
		System.out.print("                    ");
		for(int i=1;i<=31;i++){
			if(i<10){
				System.out.print(" "+i+"   ");
			}
			else{
				System.out.print(i+"   ");
			}
			if((start+i-1)%7==0){
				System.out.println();
			}
		
		}

	}

}
